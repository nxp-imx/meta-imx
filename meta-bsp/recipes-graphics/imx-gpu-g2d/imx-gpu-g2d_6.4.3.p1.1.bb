require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "128dcbd58b9cae64c06109e951c2c041"
SRC_URI[aarch64.sha256sum] = "8d46ad4f4870e17026f35ccb82035a41ae7afa1b4ec55155be700c3f588570fd"
SRC_URI[arm.md5sum] = "fa30b31e515c08c6af9d2635bcd8b281"
SRC_URI[arm.sha256sum] = "96c1ffbf9c33dcfa7e242f239be6a21cb2d50e0bc3c6c624ba61d2124efe1c06"
