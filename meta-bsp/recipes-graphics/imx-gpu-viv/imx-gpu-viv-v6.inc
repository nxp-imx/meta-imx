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
INSANE_SKIP_libvulkan-imx += "dev-so"

FILES_libopenvx-imx_append = " ${libdir}/libOpenVX${REALSOLIBS} ${libdir}/libOvx*${SOLIBS}"
FILES_libopenvx-imx-dev_remove = "${libdir}/libopenVX${SOLIBSDEV}"
FILES_libopenvx-imx-dev_append = " ${libdir}/libOpenVX${SOLIBSDEV}"
RDEPENDS_libopenvx-imx = "libnn-imx"
INSANE_SKIP_libopenvx-imx += "dev-so"

FILES_libopencl-imx_append = " ${libdir}/libOpenCL${REALSOLIBS}"
INSANE_SKIP_libopencl-imx += "dev-so"

FILES_libnn-imx = "${libdir}/libNN*${SOLIBS}"

RDEPENDS_libgal-imx += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'valgrind', '', d)}"

RDEPENDS_libopenvg-imx += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd-gpuconfig', '', d)}"

python __anonymous() {
    # Undo libvulkan variable processing done upstream
    d.setVar("DEBIAN_NOAUTONAME_libvulkan-imx", "0")
    d.setVar("RREPLACES_libvulkan-imx", "")
    d.setVar("RPROVIDES_libvulkan-imx", "")
    d.setVar("RCONFLICTS_libvulkan-imx", "")
    d.setVar("DEBIAN_NOAUTONAME_libvulkan-imx-dev", "0")
    d.setVar("RREPLACES_libvulkan-imx-dev", "")
    d.setVar("RPROVIDES_libvulkan-imx-dev", "")
    d.setVar("RCONFLICTS_libvulkan-imx-dev", "")
}
