require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5b652a451259ff348992c1ed28bb9f83"
SRC_URI[aarch64.sha256sum] = "0d523fb2473cc40c1de0650a7e3a23d68742fc135445b2403c4c36d6ce449984"
SRC_URI[arm.md5sum] = "6916742f73b3f8e30aa2e5d6a5346941"
SRC_URI[arm.sha256sum] = "2f663a6a6627125de4a2864f11bd3a0c0eeed972ef001b7a8f8d75caccc76b5a"
