# gbm libraries are now provided by vivante so remove it from mesa
PROVIDES_remove_mx6sl = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl gbm"
PROVIDES_remove_mx6q = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl virtual/libgl gbm"
PROVIDES_remove_mx6dl = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl virtual/libgl gbm"
PROVIDES_remove_mx6sx = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl virtual/libgl gbm"
PROVIDES_remove_mx7ulp = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl virtual/libgl gbm"
PROVIDES_remove_mx6sx = "virtual/libgl"

PACKAGECONFIG_remove_mx6 = "gbm"
PACKAGECONFIG_remove_mx6sl = "egl gles gbm"
PACKAGECONFIG_remove_mx6q = "egl gles gbm"
PACKAGECONFIG_remove_mx6dl = "egl gles gbm"
PACKAGECONFIG_remove_mx6sx = "egl gles gbm"
PACKAGECONFIG_remove_mx7ulp = "egl gles gbm"

# glx headers are now provided by vivante
do_install_append_mx6 () {
    if [ "${USE_VIV_LIBGL}" = "yes" ]; then
        rm -f ${D}${includedir}/GL/glx.h \
              ${D}${includedir}/GL/glxext.h
    fi
}

# FIXME: Dirty hack to allow use of Vivante GPU libGL binary
do_install_append_mx7ulp () {
    if [ "${USE_VIV_LIBGL}" = "yes" ]; then
        rm -f ${D}${libdir}/libGL.* \
              ${D}${includedir}/GL/gl.h \
              ${D}${includedir}/GL/glext.h \
              ${D}${includedir}/GL/glx.h \
              ${D}${includedir}/GL/glxext.h
    fi
}
