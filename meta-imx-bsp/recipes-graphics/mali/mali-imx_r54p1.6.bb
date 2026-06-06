require mali-imx-overrides.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[sha256sum] = "d5340a7b21073262d8b4e1e1184b908e4aab0faca5b28125e8b2d2b70d628f42"
IMX_SRCREV_ABBREV = "753ba30"

inherit fsl-eula2-unpack2 fsl-eula-recent

do_install:append() {
    # Move firmware to nonarch_base_libdir
    if [ "${base_libdir}" != "${nonarch_base_libdir}" ]; then
        install -d ${D}${nonarch_base_libdir}
        mv ${D}${base_libdir}/firmware ${D}${nonarch_base_libdir}
    fi
}

SRC_URI:append = " \
    file://mali-imx \
    file://mali-imx-boot \
    file://mali-imx.service"

inherit_defer ${@bb.utils.contains('IMX_MALI_DUAL_DRIVER', '1', 'systemd', '', d)}

SYSTEMD_PACKAGES = "${PN}-dual"
SYSTEMD_SERVICE:${PN}-dual = "mali-imx.service"
SYSTEMD_AUTO_ENABLE:${PN}-dual = "enable"

do_install:append() {
    # Dual-driver mode
    if [ "${IMX_MALI_DUAL_DRIVER}" = "1" ]; then
        # Install switcher script, boot script, and systemd service for dual-driver mode
        install -d ${D}${bindir}
        install -m 0755 ${UNPACKDIR}/mali-imx ${D}${bindir}/
        install -d ${D}${libexecdir}
        install -m 0755 ${UNPACKDIR}/mali-imx-boot ${D}${libexecdir}/
        install -d ${D}${systemd_system_unitdir}
        install -m 0644 ${UNPACKDIR}/mali-imx.service ${D}${systemd_system_unitdir}/

        # Remove headers and pkgconfig, mesa is used for linking
        rm  -rf ${D}${includedir} ${D}${libdir}/pkgconfig

        # Organize libraries in subdirectory
        install -d ${D}${libdir}/mali-imx

        # Move libmali.so first (it's the main library)
        cd ${D}${libdir}
        find . -maxdepth 1 -name "libmali.so*" -exec mv {} mali-imx/ \;

        # Move EGL/GLES/GBM libraries - use find to avoid glob expansion issues
        find . -maxdepth 1 \( -name "libEGL.so*" -o -name "libGLESv1_CM.so*" -o -name "libGLESv2.so*" -o -name "libgbm.so*" \) -exec mv {} mali-imx/ \;

        # Update Vulkan ICD manifest (already points to /usr/lib/mali-imx/libmali.so - verify it)
        if [ -f ${D}${datadir}/vulkan/icd.d/mali_icd.json ]; then
            sed -i 's|"library_path": "/usr/lib/libmali.so"|"library_path": "/usr/lib/mali-imx/libmali.so"|g' \
                ${D}${datadir}/vulkan/icd.d/mali_icd.json
        fi

        # Update OpenCL ICD manifest to point to /usr/lib/mali-imx/libmali.so
        if [ -f ${D}${sysconfdir}/OpenCL/vendors/mali-imx.icd ]; then
            sed -i 's|^libmali.so$|/usr/lib/mali-imx/libmali.so|g' \
                ${D}${sysconfdir}/OpenCL/vendors/mali-imx.icd
        fi

        # Install default driver configuration and module blacklist
        # This ensures the rootfs is correctly configured from first boot

        # Map IMX_MALI_DEFAULT_DRIVER values to mali-imx script values
        # IMX_MALI_DEFAULT_DRIVER can be "mali-imx" or "mesa"
        # mali-imx script expects "arm-ddk" or "mesa"
        DEFAULT_DRIVER="${IMX_MALI_DEFAULT_DRIVER}"
        if [ "$DEFAULT_DRIVER" = "mali-imx" ]; then
            DEFAULT_DRIVER="arm-ddk"
        fi

        # Create configuration file with default driver
        install -d ${D}${sysconfdir}/mali-imx
        cat > ${D}${sysconfdir}/mali-imx/mali-imx.conf << EOF
# Mali/Mesa GPU driver configuration
# Valid values: arm-ddk, mesa
MALI_IMX_DEFAULT_DRIVER=$DEFAULT_DRIVER
EOF

        # Configure module blacklist and module-load based on default driver
        install -d ${D}${sysconfdir}/modprobe.d
        install -d ${D}${nonarch_libdir}/modules-load.d

        if [ "$DEFAULT_DRIVER" = "arm-ddk" ]; then
            # Blacklist Mesa module for arm-ddk
            cat > ${D}${sysconfdir}/modprobe.d/mali-imx.conf << EOF
# Mali DDK configuration - blacklist Mesa Panthor driver
blacklist panthor
EOF
            # Create module-load config for Mali DDK
            cat > ${D}${nonarch_libdir}/modules-load.d/mali_kbase.conf << EOF
# Load Mali DDK kernel module at boot
mali_kbase
EOF
        else
            # Blacklist Mali module for mesa (default)
            cat > ${D}${sysconfdir}/modprobe.d/mali-imx.conf << EOF
# Mesa configuration - blacklist Mali DDK driver
blacklist mali_kbase
EOF
            # Create module-load config for Mesa Panthor
            cat > ${D}${nonarch_libdir}/modules-load.d/panthor.conf << EOF
# Load Mesa Panthor kernel module at boot
panthor
EOF
        fi
    fi
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
