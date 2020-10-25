require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[md5sum] = "1bb81100d1388aa6d23c6e3ea8c7e34b"
SRC_URI[sha256sum] = "0669fd572eafa79f61e06f17537614b20ebbaf7f2f0d74ee51a6295afd9a426e"

RDEPENDS_${PN} += "libopencl-imx"
