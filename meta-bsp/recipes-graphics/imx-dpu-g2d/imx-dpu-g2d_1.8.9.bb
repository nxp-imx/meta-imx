require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "abf73d77dae8a1a5cfb1da0588c16cad"
SRC_URI[sha256sum] = "b44b4dac5af3fd6cb54359729f128b4abac64e3472802b302b9faa816f4af0f4"

RDEPENDS_${PN} += "libopencl-imx"
