require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=e9e880185bda059c90c541d40ceca922" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d3d61c6a6cdbc230df0fadde77783cb1"
SRC_URI[aarch64.sha256sum] = "647df4970c566f61b508724622a1d22e894cb927a77cc0ec43372aacaeb7c96c"
SRC_URI[arm.md5sum] = "b70593989cd89e1d7f85c9887a110d0b"
SRC_URI[arm.sha256sum] = "d5c6283d2cf38683d0a77b0e2a13eab610fe91994731bd1ce87a7be5a8c700e1"
