require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "259fb8169a9d53c3476327c3ac30e6ac"
SRC_URI[aarch64.sha256sum] = "8a6ede11ecb5cc47a517e563690b54290aefcc1523c3aa1d1e4af6dc107bf1a3"
SRC_URI[arm.md5sum] = "bc0bbbb99b8e72d6112bab3d8e223020"
SRC_URI[arm.sha256sum] = "8c4267114f6db6890674a145f12923439489f3a624a352b217116ace735a8451"
