# gbm libraries are now provided by vivante so remove it from mesa

PACKAGECONFIG_remove_mx6 = "gbm"
PACKAGECONFIG_remove_mx7ulp = "egl gles gbm"

# glx headers are now provided by vivante
do_install_append_mx6 () {
    if [ "${USE_VIV_LIBGL}" = "yes" ]; then
        rm -f ${D}${includedir}/GL/glx.h \
              ${D}${includedir}/GL/glxext.h
    fi
}

PROVIDES_remove_mx7ulp = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl virtual/libgl"

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
