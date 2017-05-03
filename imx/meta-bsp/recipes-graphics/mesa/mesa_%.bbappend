PROVIDES_remove_imxgpu2d = "gbm"
PACKAGECONFIG_remove_imxgpu2d = "gbm"

do_install_append_imxgpu3d () {
    rm -f ${D}${includedir}/GL/glx.h \
             ${D}${includedir}/GL/glxext.h
}
