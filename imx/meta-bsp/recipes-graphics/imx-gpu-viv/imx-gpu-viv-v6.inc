require recipes-graphics/imx-gpu-viv/imx-gpu-viv-6.inc

EXTRA_PROVIDES_remove = "virtual/libopenvx"
PROVIDES_OPENVX       = ""
PROVIDES_OPENVX_mx8   = "virtual/libopenvx"
PROVIDES_OPENVX_mx8mm = ""
PROVIDES += "${PROVIDES_OPENVX}"

PACKAGES =+ "libnn-imx"

GLES3_HEADER_REMOVALS_mx8mn = "gl32.h"
GLES3_HEADER_REMOVALS_mx8qxp_remove = "gl32.h"

FILES_libgbm-imx_mx8 = "${libdir}/libgbm*${SOLIBS}"

FILES_libopenvx-imx = "${libdir}/libOpenVX*${SOLIBS} ${libdir}/libOvx*${SOLIBS} ${libdir}/libovx*${SOLIBS}"
FILES_libopenvx-imx-dev = "${includedir}/VX"
RDEPENDS_libopenvx-imx = "libnn-imx"

FILES_libnn-imx = "${libdir}/libNN*${SOLIBS} ${libdir}/libneuralnetworks${SOLIBS}"

RDEPENDS_libopenvg-imx += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd-gpuconfig', '', d)}"
