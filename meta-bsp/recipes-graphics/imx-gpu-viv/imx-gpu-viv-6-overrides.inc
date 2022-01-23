require recipes-graphics/imx-gpu-viv/imx-gpu-viv-6.inc

PACKAGECONFIG ?= "valgrind"

LIBVULKAN_VERSION = "${LIBVULKAN_VERSION_MAJOR}.2.1"

# dri is removed and framebuffer is no longer built for 64-bit,
# so make a workaround so the base install is not broken
do_install:prepend() {
    mkdir -p ${S}/gpu-core/usr/lib/dri
    if [ "${IS_MX8}" = "1" ]; then
        mkdir -p ${S}/gpu-core/usr/lib/fb
        touch ${S}/gpu-core/usr/lib/fb/libVDK.so.1.2.0
    fi
}
do_install:append() {
    rm -rf ${D}${libdir}/dri
    if [ "${IS_MX8}" = "1" ]; then
        rm -f ${D}${libdir}/libVDK-fb.so.1.2.0
    fi
}

RDEPENDS:libopenvg-imx += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd-gpuconfig', '', d)}"

RRECOMMENDS:libgal-imx:remove = "kernel-module-imx-gpu-viv"

# FIXME: Don't add .so to main package
FILES:libvulkan-imx += "${libdir}/libvulkan_VSI${SOLIBS}"
INSANE_SKIP:libvulkan-imx += "dev-so"
FILES:libopenvx-imx += "${libdir}/libOpenVX${SOLIBS}"
INSANE_SKIP:libopenvx-imx += "dev-so dev-deps"
FILES:libopencl-imx += "${libdir}/libOpenCL${SOLIBS}"
INSANE_SKIP:libopencl-imx += "dev-so dev-deps"
FILES:libopenvg-imx += "${libdir}/libOpenVG*${SOLIBS}"
INSANE_SKIP:libopenvg-imx += "dev-so"
FILES:libvdk-imx += "${libdir}/libVDK*${SOLIBS}"
INSANE_SKIP:libvdk-imx += "dev-so"
