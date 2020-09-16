require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.8.3.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[md5sum] = "39679c5e55056dadb33af7c2413638c4"
SRC_URI[sha256sum] = "a17681feafac6d8a4d564b6f132cce0fae48dd5d02258e8a5757255856cfa6de"

RDEPENDS_${PN} += "libopencl-imx"
