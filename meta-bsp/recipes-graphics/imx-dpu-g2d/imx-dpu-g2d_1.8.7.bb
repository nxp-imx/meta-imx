require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "675b26f0bf6d7255551b70c973f1d567"
SRC_URI[sha256sum] = "41af189350d9604fdfc522a27f36b6a4e60f97a392f122ca0e51983ee1515dfa"

RDEPENDS_${PN} += "libopencl-imx"
