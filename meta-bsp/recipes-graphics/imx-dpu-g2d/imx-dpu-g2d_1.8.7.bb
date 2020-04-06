require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "81793d056be908bb500fd30d1c9969ca"
SRC_URI[sha256sum] = "d577240f6d63a62c60e113ebb13e441cbf5d906b227d7703f2564a9b55dfeb80"

RDEPENDS_${PN} += "libopencl-imx"
