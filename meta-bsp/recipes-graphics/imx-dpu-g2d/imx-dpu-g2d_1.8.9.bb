require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "8c741994d193eecc73fe77f349c3bcce"
SRC_URI[sha256sum] = "989db2658fa3dc093c427090e6a74f28a84f95b0a98e8e517eb73e212b3a4c88"

RDEPENDS_${PN} += "libopencl-imx"
