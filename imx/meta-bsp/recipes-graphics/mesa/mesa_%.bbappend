# As i.MX8MQ has no imxgpu2d hw, need remove mesa features to avoid multple provider issue
PROVIDES_remove_imxgpu3d = "virtual/libgles1 virtual/libgles2 virtual/libopenvg virtual/egl virtual/libgl gbm"
PROVIDES_remove_imxgpu2d = "gbm"

PACKAGECONFIG_remove_imxgpu3d = "egl gles gbm"
PACKAGECONFIG_remove_imxgpu2d = "gbm"

BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', \
        bb.utils.contains('DISTRO_FEATURES',     'x11',     'x11', \
                                                             'fb', d), d)}"
do_install_append_imxgpu3d () {
    rm -f ${D}${includedir}/GL/glx.h \
          ${D}${includedir}/GL/glxext.h
    if [ "${BACKEND}" = "x11" ]; then
        rm -f ${D}${libdir}/pkgconfig/gl.pc
    fi
}
