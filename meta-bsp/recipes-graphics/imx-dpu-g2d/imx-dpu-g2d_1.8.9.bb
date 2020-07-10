require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "899f8a09d3edfbcc5dae94957b04ec7c"
SRC_URI[sha256sum] = "7e96b35c424c74d454fa61f3a9491e1ab9b72db5e8da509b759ad9c1bf001ae5"

RDEPENDS_${PN} += "libopencl-imx"
