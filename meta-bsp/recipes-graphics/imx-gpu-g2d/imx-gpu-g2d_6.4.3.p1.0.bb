require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "49acee51a0dd154c3da408164afc35af"
SRC_URI[aarch64.sha256sum] = "72df83fb349be9aa4368cc2ae7c7f67c3cfe7065241142a6cb7f37a558456f79"
SRC_URI[arm.md5sum] = "1aeb5c24d2a7a631dc9f545649ab63fa"
SRC_URI[arm.sha256sum] = "cbd65e2af53df3beb89393d36790cea5dedf4adb33c202227083887d031e68ab"
