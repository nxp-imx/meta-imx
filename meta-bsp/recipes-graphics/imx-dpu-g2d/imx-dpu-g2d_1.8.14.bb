require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[md5sum] = "4b2bee9cdae401d8cbec2caaa1334d91"
SRC_URI[sha256sum] = "b7b3957f1b5a2961d53b067e7f374513cea1abdd7fe1004a5372a7e82ce73755"

RDEPENDS_${PN} += "libopencl-imx"
