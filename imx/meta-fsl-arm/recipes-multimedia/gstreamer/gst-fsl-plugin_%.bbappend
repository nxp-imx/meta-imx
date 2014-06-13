# The ddplus codec does not support mx28
DDPDEPENDS = "libfslddpcodec"
DDPDEPENDS_mx28 = ""
PACKAGECONFIG[ddp] = "--enable-ddpdec,--disable-ddpdec,,${DDPDEPENDS}"
