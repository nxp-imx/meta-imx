PROVIDES_remove_imxgpu2d = "gbm"
PROVIDES_remove_mx7ulp = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl virtual/libgl gbm"

PACKAGECONFIG_remove_imxgpu2d = "gbm"
PACKAGECONFIG_remove_mx7ulp = "egl gles gbm"

USE_V6_GRAPHICS = "${@bb.utils.contains("DISTRO_FEATURES", "imx_v6_graphics", "yes", "no", d)}"
USE_V6_GRAPHICS_mx7ulp = "yes"

do_install_append_imxgpu3d () {
    if [ "${USE_V6_GRAPHICS}" = "yes" ]; then
       rm -f ${D}${includedir}/GL/glx.h \
             ${D}${includedir}/GL/glxext.h
    fi
}
