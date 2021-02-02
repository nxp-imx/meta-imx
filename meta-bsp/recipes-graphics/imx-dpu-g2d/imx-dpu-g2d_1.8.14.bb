require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[md5sum] = "18a4119f1f7b83a09f60381e5403bbab"
SRC_URI[sha256sum] = "ba7e219b3cee32e0ac305685de21c67f30e0e5a1a89b5ec441ae6b8484b3f964"

RDEPENDS_${PN} += "libopencl-imx"
