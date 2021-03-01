require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=231e11849a4331fcbb19d7f4aab4a659"

SRC_URI[md5sum] = "51b1a54f303bea31325549e9fb1f0d04"
SRC_URI[sha256sum] = "360012a32353bde233a548f25a8f99b18660059ea2655ab15335a967843ce3b9"

RDEPENDS_${PN} += "libopencl-imx"
