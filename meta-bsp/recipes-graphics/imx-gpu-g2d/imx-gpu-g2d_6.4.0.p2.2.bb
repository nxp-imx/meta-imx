require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9461abf201e0371f13d55163acca1188"
SRC_URI[aarch64.sha256sum] = "958b6e95385aafc26147c7d15440ea9a9323b52a6c0efc5d69153cd9d4065c00"
SRC_URI[arm.md5sum] = "5c15547fb6ecdd1dd3a162e4a8bf9c91"
SRC_URI[arm.sha256sum] = "c5246af7335fb1050335cd8cc722de50ccc1cf2e21df2d350f8bb5875c880370"
