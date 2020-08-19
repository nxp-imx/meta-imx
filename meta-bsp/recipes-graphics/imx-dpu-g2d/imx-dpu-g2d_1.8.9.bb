require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "4ddddb3fe8e4c81e1644b0c1befc8e77"
SRC_URI[sha256sum] = "7f164fc1ef77fd7e14a4b43d9520c018d1c8a50a95459fcee8dad875d5a118b7"

RDEPENDS_${PN} += "libopencl-imx"
