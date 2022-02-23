require recipes-graphics/imx-gpu-viv/imx-gpu-viv-6.inc

PROVIDES_OPENGLES3       = ""
PROVIDES_OPENGLES3:mx8-nxp-bsp   = "virtual/libgles3"
PROVIDES_OPENGLES3:mx8mm-nxp-bsp = ""
PROVIDES += "${PROVIDES_OPENGLES3}"

PACKAGECONFIG ?= "valgrind"

LIBVULKAN_VERSION = "${LIBVULKAN_VERSION_MAJOR}.2.1"

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
