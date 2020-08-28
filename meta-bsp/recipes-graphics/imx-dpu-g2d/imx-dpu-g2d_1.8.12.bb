require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[md5sum] = "75440208f5df6b4fbf02cf7f6dff1e56"
SRC_URI[sha256sum] = "4341554f8ee11b1c06aa837992781ac8b20d81acccd120368f8fbe3c2af207ae"

RDEPENDS_${PN} += "libopencl-imx"
