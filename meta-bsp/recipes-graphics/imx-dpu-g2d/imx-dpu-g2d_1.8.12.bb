require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.8.7.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=e9e880185bda059c90c541d40ceca922"

SRC_URI[md5sum] = "39e767a810c02d505f82c6c8d15b0305"
SRC_URI[sha256sum] = "b605b8184824bac15047dc9317a53da98d2bf0004eb737bfdb198940b6d89f67"

RDEPENDS_${PN} += "libopencl-imx"
