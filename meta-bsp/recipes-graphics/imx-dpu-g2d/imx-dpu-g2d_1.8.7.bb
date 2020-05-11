require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "2b8fea58c87a724c1d5c023ee8bd551b"
SRC_URI[sha256sum] = "7533e34f447e8b076fa6461ac83806efdd677310094741eef2a67858034730fe"

RDEPENDS_${PN} += "libopencl-imx"
