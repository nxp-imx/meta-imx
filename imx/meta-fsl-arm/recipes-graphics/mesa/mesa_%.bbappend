SRC_URI += "ftp://ftp.freedesktop.org/pub/mesa/older-versions/9.x/9.2.5/MesaLib-9.2.5.tar.bz2"
PACKAGECONFIG[x11] = "--enable-glx,--disable-glx,${X11_DEPS}"
