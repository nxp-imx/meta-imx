require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.8.7.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

SRC_URI[md5sum] = "bfa5eb2416dfa78270af479565876fb7"
SRC_URI[sha256sum] = "339f2767e037af3bd80d556b07a4de184c7d07d1282d8e496fa721c280f6fd48"

RDEPENDS_${PN} += "libopencl-imx"
