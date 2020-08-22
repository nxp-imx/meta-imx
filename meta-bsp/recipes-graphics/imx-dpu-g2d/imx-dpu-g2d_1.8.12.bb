require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[md5sum] = "050f6fce52eff8cda78461f57871e8a6"
SRC_URI[sha256sum] = "d31856bdece26381cf838b8b9254c4544d82145829bdbc54741e2df5ed621f49"

RDEPENDS_${PN} += "libopencl-imx"
