GBM_REMOVES = "${@bb.utils.contains("DISTRO_FEATURES", "imx_v6_graphics", "gbm", "", d)}"
GBM_REMOVES_mx7ulp = "gbm"

PROVIDES_remove_imxgpu2d = "${GBM_REMOVES}"
PACKAGECONFIG_remove_imxgpu2d = "${GBM_REMOVES}"

USE_V6_GRAPHICS = "${@bb.utils.contains("DISTRO_FEATURES", "imx_v6_graphics", "yes", "no", d)}"
USE_V6_GRAPHICS_mx7ulp = "yes"

do_install_append_imxgpu3d () {
    if [ "${USE_V6_GRAPHICS}" = "yes" ]; then
       rm -f ${D}${includedir}/GL/glx.h \
             ${D}${includedir}/GL/glxext.h
    fi
}
