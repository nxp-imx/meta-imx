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
    if [ "${IMX_MALI_DUAL_DRIVER}" = "0" ]; then
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
