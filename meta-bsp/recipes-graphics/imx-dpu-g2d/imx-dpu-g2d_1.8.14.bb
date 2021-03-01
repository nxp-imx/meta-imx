require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI[md5sum] = "51b1a54f303bea31325549e9fb1f0d04"
SRC_URI[sha256sum] = "360012a32353bde233a548f25a8f99b18660059ea2655ab15335a967843ce3b9"

RDEPENDS_${PN} += "libopencl-imx"
