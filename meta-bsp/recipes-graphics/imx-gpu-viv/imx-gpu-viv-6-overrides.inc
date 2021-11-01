require recipes-graphics/imx-gpu-viv/imx-gpu-viv-6.inc

PACKAGECONFIG ?= "valgrind"

# dri and libVDK.so are removed, make a workaround so base install is not broken
do_install:prepend() {
    mkdir -p ${S}/gpu-core/usr/lib/dri
    mkdir -p ${S}/gpu-core/usr/lib/fb
    touch ${S}/gpu-core/usr/lib/fb/libVDK.so.1.2.0
}
do_install:append() {
    rm -rf ${D}${libdir}/dri
    rm -f ${D}${libdir}/libVDK-fb.so.1.2.0
}

RDEPENDS:libopenvg-imx += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd-gpuconfig', '', d)}"

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
