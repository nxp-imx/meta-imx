require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[md5sum] = "6372d6ea127f822ee628c4d656eccf7c"
SRC_URI[sha256sum] = "f6ee79d680a4f8f1782fdbe6a35a2dbb474fe75bc7e43731b3b9002f173a958a"

RDEPENDS_${PN} += "libopencl-imx"
