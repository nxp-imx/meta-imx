require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "878b0a66af97c4794fa1f1343a13e1de"
SRC_URI[aarch64.sha256sum] = "2efba641364c011d89f0f97354756140ffcd006938c6a1861579c84a70ae8423"
SRC_URI[arm.md5sum] = "89ee09778602ebe37760ccff5f71af51"
SRC_URI[arm.sha256sum] = "a58f5f8a333b9afade57cbc84635e1cc252b1ae38b407a202f901d713207a002"
