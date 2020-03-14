require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "89a3f1329f3e09b6c327bb70a74b00d9"
SRC_URI[aarch64.sha256sum] = "0e1a3112eacdd45d1ebb41257d8ff92608128c512f06b9467454f2f47b86cc50"
SRC_URI[arm.md5sum] = "6e8f7ef862ffbefe19fab2e99cab6c5a"
SRC_URI[arm.sha256sum] = "ad737f53291d71be57c2e0e8e93e5dbc4e95d63a790f98f662188ce4d6ace3ed"
