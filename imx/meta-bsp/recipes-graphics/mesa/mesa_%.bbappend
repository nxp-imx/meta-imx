# gbm libraries are now provided by vivante so remove it from mesa

PACKAGECONFIG_remove_mx6 = "gbm"

# glx headers are now provided by vivante
do_install_append_mx6 () {
    if [ "${USE_VIV_LIBGL}" = "yes" ]; then
        rm -f ${D}${includedir}/GL/glx.h \
              ${D}${includedir}/GL/glxext.h
    fi
}
