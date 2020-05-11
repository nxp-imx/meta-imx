require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "cfdb2b3100daf81e0b2aef9c750ba31e"
SRC_URI[sha256sum] = "cf79d41037e03c12a2368e9e5faccaae7749a456bf3c4b664d6ff42ff9470622"

RDEPENDS_${PN} += "libopencl-imx"
