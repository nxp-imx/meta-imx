
PACKAGECONFIG[x11] = "--enable-glx,--disable-glx,${X11_DEPS}"

do_install_append_mx6 () {
    if [ "${USE_VIV_LIBGL}" = "yes" ]; then
	rm -rf ${D}${includedir}/GL/gl.h
	rm -rf ${D}${includedir}/GL/glext.h
    fi
}
