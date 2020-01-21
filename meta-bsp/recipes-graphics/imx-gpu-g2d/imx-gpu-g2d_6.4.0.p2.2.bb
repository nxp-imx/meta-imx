require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "c72ceedb636e5cec825a1e6f1e5feea7"
SRC_URI[aarch64.sha256sum] = "023476d233a2ec3e0ce6e25d005bd9dc3a68f3d8a819d20fcbc23da5d1e9ec90"
SRC_URI[arm.md5sum] = "89ee09778602ebe37760ccff5f71af51"
SRC_URI[arm.sha256sum] = "a58f5f8a333b9afade57cbc84635e1cc252b1ae38b407a202f901d713207a002"
