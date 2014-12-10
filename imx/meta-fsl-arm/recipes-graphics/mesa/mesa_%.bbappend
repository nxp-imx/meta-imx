PROVIDES_remove_mx6sx = "virtual/libgl"

PACKAGECONFIG[x11] = "--enable-glx,--disable-glx,${X11_DEPS}"
