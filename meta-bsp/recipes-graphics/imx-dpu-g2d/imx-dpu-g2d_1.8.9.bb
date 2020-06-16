require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[md5sum] = "befcc9ecddf5fe803ab9489f62d8ebf2"
SRC_URI[sha256sum] = "99ded5a3e71de94dec53356ad6fcb12a4f4bb942180c5f5c84cd00ef53525ffc"

RDEPENDS_${PN} += "libopencl-imx"
