# gbm libraries are now provided by vivante so remove it from mesa
PROVIDES_remove_imxgpu2d = " virtual/egl gbm"
PROVIDES_remove_imxgpu3d = " virtual/libgl virtual/libgles2 virtual/libgles1 virtual/egl gbm"
PROVIDES_remove_mx6q = " virtual/egl gbm virtual/libgl virtual/libgles2 virtual/libgles1 virtual/libopenvg"
PROVIDES_remove_mx6sl = "  virtual/egl gbm virtual/libopenvg"
PROVIDES_remove_mx8 = " virtual/egl gbm virtual/libgl virtual/libgles2 virtual/libgles1 virtual/libopenvg"

USE_VIV_LIBGL = "yes"
USE_VIV_LIBGL_mx6sl = "no"

# glx headers are now provided by vivante
do_install_append_imxgpu2d () {
    if [ "${USE_VIV_LIBGL}" = "yes" ]; then
        rm -f ${D}${includedir}/GL/glx.h \
              ${D}${includedir}/GL/glxext.h \
              ${D}${includedir}/GL/gl.h \
              ${D}${includedir}/GL/glext.h 
    fi
}
