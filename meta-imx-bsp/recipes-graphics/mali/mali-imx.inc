SUMMARY = "Graphics libraries and driver for i.MX Mali GPU"
SECTION = "libs"
DEPENDS = " \
    libdrm \
    vulkan-loader \
    wayland \
    wayland-protocols"
# In single-driver mode, provide virtual/* packages
# In dual-driver mode, don't provide them (mesa will be the provider)
PROVIDES = \
    "${@'' if d.getVar('IMX_MALI_DUAL_DRIVER') == '1' \
    else ' \
        virtual/egl \
        virtual/libgbm \
        virtual/libgles1 \
        virtual/libgles2 \
        virtual/libgles3'}"

SRC_URI:append = " \
    file://mali-imx \
    file://mali-imx-boot \
    file://mali-imx.conf \
    file://mali-imx.service"

inherit systemd

SYSTEMD_PACKAGES = "${PN}-dual"
SYSTEMD_SERVICE:${PN}-dual = "mali-imx.service"
SYSTEMD_AUTO_ENABLE:${PN}-dual = "enable"

# The packaged binaries have been stripped of debug info, so disable
# operations accordingly.
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

PACKAGES =+ " \
    ${PN}-libegl     ${PN}-libegl-dev \
    ${PN}-libgbm     ${PN}-libgbm-dev \
    ${PN}-libgles1   ${PN}-libgles1-dev \
    ${PN}-libgles2   ${PN}-libgles2-dev \
    ${PN}-libgles3   ${PN}-libgles3-dev \
    ${PN}-libvulkan  \
    ${PN}-opencl-icd ${PN}-opencl-icd-dev"

# Add dual-driver package in dual-driver mode
PACKAGES =+ "${PN}-dual"

# In dual-driver mode, libs go in /usr/lib/mali-imx/
IMX_MALI_DUAL_SUBDIR = "${@'/mali-imx' if d.getVar('IMX_MALI_DUAL_DRIVER') == '1' else ''}"

# Since libmali.so is loaded by dlopen, include it in the main package
FILES:${PN} += " \
    ${libdir}${IMX_MALI_DUAL_SUBDIR}/libmali.so \
    ${nonarch_base_libdir}/firmware"
FILES_SOLIBSDEV = ""
INSANE_SKIP:${PN} = "dev-so"
RDEPENDS:${PN} = "${@'mali-imx-dual' if d.getVar('IMX_MALI_DUAL_DRIVER') == '1' else ''}"

FILES:${PN}-libegl = " \
    ${libdir}${IMX_MALI_DUAL_SUBDIR}/libEGL${SOLIBS}"
FILES:${PN}-libgbm = " \
    ${libdir}${IMX_MALI_DUAL_SUBDIR}/libgbm${SOLIBS}"
FILES:${PN}-libgles1 = " \
    ${libdir}${IMX_MALI_DUAL_SUBDIR}/libGLESv1_CM${SOLIBS}"
FILES:${PN}-libgles2 = " \
    ${libdir}${IMX_MALI_DUAL_SUBDIR}/libGLESv2${SOLIBS}"

FILES:${PN}-opencl-icd = " \
    ${sysconfdir}/OpenCL"
RPROVIDES:${PN}-opencl-icd = "virtual-opencl-icd"

FILES:${PN}-libvulkan = " \
    ${sysconfdir}/vulkan"
RDEPENDS:${PN}-libvulkan = "vulkan-wsi-layer"
RPROVIDES:${PN}-libvulkan = "virtual-vulkan-icd"

# Dual-driver package files
FILES:${PN}-dual = " \
    ${bindir}/mali-imx \
    ${libexecdir}/mali-imx-boot \
    ${sysconfdir}/mali-imx/mali-imx.conf \
    ${sysconfdir}/modprobe.d/mali-imx.conf \
    ${nonarch_libdir}/modules-load.d/*.conf \
    ${systemd_system_unitdir}/mali-imx.service"
RDEPENDS:${PN}-dual = "${PN}"
SUMMARY:${PN}-dual = "Mali/Mesa dual-driver switcher utility"
DESCRIPTION:${PN}-dual = "Utility to switch between Mali DDK and Mesa GPU drivers at runtime"

FILES:${PN}-dev = " \
    ${bindir}/malisc"
FILES:${PN}-libegl-dev = " \
    ${includedir}/EGL \
    ${includedir}/KHR \
    ${libdir}/libEGL${SOLIBSDEV} \
    ${libdir}/pkgconfig/egl.pc"
FILES:${PN}-libgbm-dev = " \
    ${includedir}/gbm.h \
    ${libdir}/libgbm${SOLIBSDEV} \
    ${libdir}/pkgconfig/gbm.pc"

# Consolidate GLES dev packages
PACKAGES =+ "${PN}-libgles-dev"
FILES:${PN}-libgles-dev = " \
    ${includedir}/GLES* \
    ${libdir}/libGLES*${SOLIBSDEV} \
    ${libdir}/pkgconfig/gles*.pc"
DEBIAN_NOAUTONAME:${PN}-libgles-dev = "1"
RREPLACES:${PN}-libgles-dev = "libgles-dev"
RPROVIDES:${PN}-libgles-dev = "libgles-dev"
RCONFLICTS:${PN}-libgles-dev = "libgles-dev"
ALLOW_EMPTY:${PN}-libgles-dev = "1"
ALLOW_EMPTY:${PN}-libgles1-dev = "1"
ALLOW_EMPTY:${PN}-libgles2-dev = "1"
ALLOW_EMPTY:${PN}-libgles3-dev = "1"
RDEPENDS:${PN}-libgles1-dev = "${PN}-libgles-dev"
RDEPENDS:${PN}-libgles2-dev = "${PN}-libgles-dev"
RDEPENDS:${PN}-libgles3-dev = "${PN}-libgles-dev"

FILES:${PN}-opencl-icd-dev = " \
    ${bindir}/mali_clcc"

do_install:append() {
    # Install switcher script, boot script, config file, and systemd service for dual-driver mode
    install -d ${D}${bindir}
    install -m 0755 ${UNPACKDIR}/mali-imx ${D}${bindir}/
    install -d ${D}${libexecdir}
    install -m 0755 ${UNPACKDIR}/mali-imx-boot ${D}${libexecdir}/
    install -d ${D}${sysconfdir}/mali-imx
    install -m 0644 ${UNPACKDIR}/mali-imx.conf ${D}${sysconfdir}/mali-imx
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${UNPACKDIR}/mali-imx.service ${D}${systemd_system_unitdir}/

    # Dual-driver mode: organize libraries in subdirectory
    if [ "${IMX_MALI_DUAL_DRIVER}" = "1" ]; then
        # Remove headers and pkgconfig, mesa is used for linking
        rm  -rf ${D}${includedir} ${D}${libdir}/pkgconfig

        # Create mali-imx directory
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
    else
        install -d ${D}${sysconfdir}/modprobe.d
        install -d ${D}${nonarch_libdir}/modules-load.d

        # Blacklist Mesa module for arm-ddk
        cat > ${D}${sysconfdir}/modprobe.d/mali-imx.conf << EOF
# Mali DDK configuration - blacklist Mesa Panthor driver
blacklist panthor
EOF
        # Create module-load config for Mali DDK (single-driver mode)
        cat > ${D}${nonarch_libdir}/modules-load.d/mali_kbase.conf << EOF
# Load Mali DDK kernel module at boot
mali_kbase
EOF
    fi
}

python __anonymous() {
    gles_dual = d.getVar('IMX_MALI_DUAL_DRIVER')

    # Avoid Debian-renaming and set up conflicts
    for p in (("libegl",    "libegl1"      ),
              ("libgbm",    "libgbm1"      ),
              ("libgles1",  "libglesv1-cm1"),
              ("libgles2",  "libglesv2-2"  ),
              ("libgles3",                 )):
        fullp = "${PN}-" + p[0]
        pkgs = "".join(' %s' % i for i in p)
        d.setVar("DEBIAN_NOAUTONAME:" + fullp, "1")

        # In dual-driver mode, don't add RREPLACES/RPROVIDES to break dependency loop
        if gles_dual != '1':
            d.appendVar("RREPLACES:"  + fullp, pkgs)
            d.appendVar("RPROVIDES:"  + fullp, pkgs)
            d.appendVar("RCONFLICTS:" + fullp, pkgs)

        # libmali.so is loaded with dlopen, so an explicit runtime dependency is necessary
        d.appendVar("RDEPENDS:"   + fullp, "${PN}")

        # For -dev, the first element is both the Debian and original name
        fullp += "-dev"
        pkgs = p[0] + "-dev"
        d.setVar("DEBIAN_NOAUTONAME:" + fullp, "1")

        # In dual-driver mode, don't add RREPLACES/RPROVIDES to break dependency loop
        if gles_dual != '1':
            d.appendVar("RREPLACES:"  + fullp, pkgs)
            d.appendVar("RPROVIDES:"  + fullp, pkgs)
            d.appendVar("RCONFLICTS:" + fullp, pkgs)
}

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
