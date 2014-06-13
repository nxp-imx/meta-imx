DDPDEPENDS = "libfslddpcodec"
PACKAGECONFIG[ddp] = "--enable-ddpdec,--disable-ddpdec,,${DDPDEPENDS}"
