require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.8.3.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[md5sum] = "f0db029e78143ea5b5e60674a36262fd"
SRC_URI[sha256sum] = "d7bd81c057e750ed05797988f5dec7394f4414b84c9fa2eff0b0ddf481a8024f"

RDEPENDS_${PN} += "libopencl-imx"
