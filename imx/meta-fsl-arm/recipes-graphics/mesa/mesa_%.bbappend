SRC_URI += "ftp://ftp.freedesktop.org/pub/mesa/older-versions/9.x/${PV}/MesaLib-${PV}.tar.bz2"
PACKAGECONFIG[x11] = "--enable-glx,--disable-glx,${X11_DEPS}"