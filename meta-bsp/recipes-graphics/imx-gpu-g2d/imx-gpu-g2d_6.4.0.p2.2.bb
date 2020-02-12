require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e6286771d3111e0ca4e04e765a9d6324"
SRC_URI[aarch64.sha256sum] = "dd5b9adb1a8943f4ff69ee022a9fc288bbf5b248ab8eaed7b36fb6e4356e649c"
SRC_URI[arm.md5sum] = "2a0b3c7f2b47cf1dee344a402dee6e9d"
SRC_URI[arm.sha256sum] = "0b900c5e892442ce2c22b1f56f38862f7a47efa528b9831142dc94e24da3b49e"
