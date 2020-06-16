require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "befcc9ecddf5fe803ab9489f62d8ebf2"
SRC_URI[sha256sum] = "99ded5a3e71de94dec53356ad6fcb12a4f4bb942180c5f5c84cd00ef53525ffc"

RDEPENDS_${PN} += "libopencl-imx"
