require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ebd1a6f4f3fc37f9ee404f1c233945ae"
SRC_URI[aarch64.sha256sum] = "e45ff8a0b0527f401dfbb0b1afc1484ae30f20fee5fd6d7aa12dfcdcb2e1ed25"
SRC_URI[arm.md5sum] = "d4db0cc91cada1737653ddbf876bc444"
SRC_URI[arm.sha256sum] = "a39e749066bfca729925a7446e97510d202e939d0bfb0a0c81eac655ed6f69ce"
