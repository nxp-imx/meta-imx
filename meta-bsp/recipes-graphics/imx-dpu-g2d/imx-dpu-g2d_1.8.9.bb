require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[md5sum] = "e532d99c1116ac8b685cd03aab3f4c75"
SRC_URI[sha256sum] = "c48e2d408be9c4bf2731546bece39216c79856e554fd22f6c3040603a2348c72"

RDEPENDS_${PN} += "libopencl-imx"
