PACKAGECONFIG_remove_mx8 = "egl gles"

PROVIDES_remove_mx8 = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl virtual/libgl"

# FIXME: Dirty hack to allow use of Vivante GPU libGL binary
do_install_append_mx8 () {
    if [ "${USE_VIV_LIBGL}" = "yes" ]; then
        rm -f ${D}${libdir}/libGL.* \
              ${D}${includedir}/GL/gl.h \
              ${D}${includedir}/GL/glext.h
    fi
}
