require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "e1e938cb98099c1565f31dc91f55b298"
SRC_URI[sha256sum] = "b043fe3f7d908eafd7f8c3d76ce8e7059688c32259ab49797fe0d440a3731fea"

RDEPENDS_${PN} += "libopencl-imx"
