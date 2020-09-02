require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[md5sum] = "57cc4b39e3f5f9e2ee1486f4020afcae"
SRC_URI[sha256sum] = "7894538802b2d7365173d7e3313f3a15e5276c8ed4e7ada8845e06be44603cbd"

RDEPENDS_${PN} += "libopencl-imx"
