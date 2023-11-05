require recipes-graphics/imx-gpu-viv/imx-gpu-viv-6.inc

### Section 1: Changes to be upstreamed ###

DEPENDS:remove = "mesa"
PACKAGES:remove = "libgl-imx libgl-imx-dev"
PROVIDES:remove = "virtual/libgl"

PROVIDES_OPENGLES3:mx8mm-nxp-bsp = "virtual/libgles3"

LIBVULKAN_API_VERSION = "1.3.239"

### Section 2: Changes to be kept in meta-imx ###

PACKAGECONFIG ?= "valgrind"

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
