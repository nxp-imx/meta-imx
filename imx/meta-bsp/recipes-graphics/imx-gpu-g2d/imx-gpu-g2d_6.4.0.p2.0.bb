require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "db2dd87a86bcd2ed63e818aba46105da"
SRC_URI[aarch64.sha256sum] = "6f6db72c69ec73b5b45920fee1a9b7e8c8d46d3b3b3d87500a658d6d9e82657d"
SRC_URI[arm.md5sum] = "3a0d89eb3d29387b0832b474a2af698b"
SRC_URI[arm.sha256sum] = "0d4a1909125dc1cbced9b47a269494b3e1bba3d9859face7ab51c33a72f958e9"
