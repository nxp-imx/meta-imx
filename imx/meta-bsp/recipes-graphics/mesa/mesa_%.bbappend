PROVIDES_remove_imxgpu2d = "gbm"
PROVIDES_remove_mx7ulp = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl virtual/libgl gbm"

PACKAGECONFIG_remove_imxgpu2d = "gbm"
PACKAGECONFIG_remove_mx7ulp = "egl gles gbm"

do_install_append_imxgpu3d () {
    rm -f ${D}${includedir}/GL/glx.h \
          ${D}${includedir}/GL/glxext.h
}

# FIXME: Dirty hack to allow use of Vivante GPU libGL binary
do_install_append_mx7ulp () {
    rm -f ${D}${libdir}/libGL.* \
          ${D}${includedir}/GL/gl.h \
          ${D}${includedir}/GL/glext.h \
          ${D}${includedir}/GL/glx.h \
          ${D}${includedir}/GL/glxext.h
}
