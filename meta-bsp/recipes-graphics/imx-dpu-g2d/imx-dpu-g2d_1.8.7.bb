require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "e09729dd319f0f74e0692ff47ed0fa4b"
SRC_URI[sha256sum] = "9c3620396b449cc303cfe456e61b1026de6d1269d51453ed53216679f51d8e39"

RDEPENDS_${PN} += "libopencl-imx"
