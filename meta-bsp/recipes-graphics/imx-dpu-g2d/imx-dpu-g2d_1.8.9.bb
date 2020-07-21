require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "f0e37b163f58ebcfabb69fbffa230dca"
SRC_URI[sha256sum] = "dc479b0528f8e51a8b6e3ad05b25956aa934c58c16126170985b3b1e05ff9743"

RDEPENDS_${PN} += "libopencl-imx"
