require recipes-graphics/imx-gpu-viv/imx-gpu-viv-6.inc

EXTRA_PROVIDES_remove = "virtual/libopenvx"
PROVIDES_OPENVX       = ""
PROVIDES_OPENVX_mx8   = "virtual/libopenvx"
PROVIDES_OPENVX_mx8mm = ""
PROVIDES += "${PROVIDES_OPENVX}"

PACKAGES =+ "libnn-imx"

GLES3_HEADER_REMOVALS_mx8mn = "gl32.h"
GLES3_HEADER_REMOVALS_mx8mp  = "gl32.h"

FILES_libgbm-imx_mx8 = "${libdir}/libgbm*${SOLIBS}"

FILES_libvulkan-imx_append = " ${libdir}/libvulkan_VSI${REALSOLIBS}"

FILES_libopenvx-imx_append = " ${libdir}/libOpenVX${REALSOLIBS} ${libdir}/libOvx*${SOLIBS}"
RDEPENDS_libopenvx-imx = "libnn-imx"
INSANE_SKIP_libopenvx-imx += "dev-so"

FILES_libopencl-imx_append = " ${libdir}/libOpenCL${REALSOLIBS}"

FILES_libnn-imx = "${libdir}/libNN*${SOLIBS}"

RDEPENDS_libgal-imx += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'valgrind', '', d)}"

RDEPENDS_libopenvg-imx += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd-gpuconfig', '', d)}"
