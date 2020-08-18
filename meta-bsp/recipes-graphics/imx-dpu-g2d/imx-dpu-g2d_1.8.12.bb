require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

SRC_URI[md5sum] = "315936f97ab92bda517bae3486acfb44"
SRC_URI[sha256sum] = "41a1e0531def7f2555f5722255858cbc9cff1cbc6d47a972418d558bbcf71e8c"

RDEPENDS_${PN} += "libopencl-imx"
