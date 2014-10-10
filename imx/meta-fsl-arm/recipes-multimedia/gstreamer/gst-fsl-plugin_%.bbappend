# The ddplus codec does not support mx28
DDPDEPENDS = "libfslddpcodec"
DDPDEPENDS_mx28 = ""
PACKAGECONFIG[ddp] = ",,${DDPDEPENDS},${DDPDEPENDS}"
