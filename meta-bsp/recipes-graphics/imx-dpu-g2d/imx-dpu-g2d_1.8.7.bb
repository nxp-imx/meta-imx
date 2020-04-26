require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "8b1eba55ebb0f108300e039bfcd745bb"
SRC_URI[sha256sum] = "98eb06f0e7cfa923f92054148f0c2587fe11ac595c41837a0ed803f811208e03"

RDEPENDS_${PN} += "libopencl-imx"
