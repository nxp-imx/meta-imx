require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[md5sum] = "dc7941374ad13c3c5e3b12758228de1a"
SRC_URI[sha256sum] = "51d90f9d717995232763c28c91e76ad7fc800060ea0a610cbbfdd75099deba12"

RDEPENDS_${PN} += "libopencl-imx"
