require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9b8296077593798d04b40ab35a6af104"
SRC_URI[aarch64.sha256sum] = "919cfa8c9bc111ed615570ad6c34a9722b3ae1f90c7eb75ffd783d7bed6d6e7b"
SRC_URI[arm.md5sum] = "2e646aa5e5c50fb0579523f28571c7df"
SRC_URI[arm.sha256sum] = "07d45bd4559056a86a27e64a8bbe9064f89c076e9643af76b6866bce3bba78bf"
