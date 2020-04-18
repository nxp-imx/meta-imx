require recipes-graphics/imx-dpu-g2d/imx-dpu-g2d_1.7.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "ddcf22df2da0eea059b278be47a1e84f"
SRC_URI[sha256sum] = "32e044c0776f972f11dfbfbe97b64d3e589e3640ec2f00037036ddfb08ba51f3"

RDEPENDS_${PN} += "libopencl-imx"
