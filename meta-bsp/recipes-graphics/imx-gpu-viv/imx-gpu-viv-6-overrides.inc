require recipes-graphics/imx-gpu-viv/imx-gpu-viv-6.inc

PACKAGECONFIG ?= "valgrind"

LIBVULKAN_VERSION = "${LIBVULKAN_VERSION_MAJOR}.2.1"

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

PROVIDES += "libglu"
PACKAGES =+ "libglu-imx libglu-imx-dev"
do_install:append() {
    # NOTE: Drop the if-statement when upstreaming, it's only needed internally
    if [ -f ${S}/gpu-core/usr/lib/pkgconfig/glu.pc ]; then
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/glu.pc ${D}${libdir}/pkgconfig/glu.pc
    fi
}
FILES:libglu-imx = "${libdir}/libGLU${SOLIBS}"
FILES:libglu-imx-dev = "${includedir}/GL/glu.h ${includedir}/GL/glu_mangle.h ${libdir}/pkgconfig/glu.pc"

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
