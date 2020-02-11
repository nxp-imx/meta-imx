require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "259fb8169a9d53c3476327c3ac30e6ac"
SRC_URI[aarch64.sha256sum] = "8a6ede11ecb5cc47a517e563690b54290aefcc1523c3aa1d1e4af6dc107bf1a3"
SRC_URI[arm.md5sum] = "eeb8305e156507337bfc3cb84e7d80a5"
SRC_URI[arm.sha256sum] = "2ac3335df53d2064f22a779346374b6198802fd75d7590663eff38caa12744b7"
