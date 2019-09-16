require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "67f421476c04b850d431eac05f3f0d40"
SRC_URI[aarch64.sha256sum] = "4afef223dddc0d8d7932144f025941c93bc74b0e1a46348dde263da9ecb310e4"
SRC_URI[arm.md5sum] = "ae385ef1f7858f8607b5dce1fa19f499"
SRC_URI[arm.sha256sum] = "646f887c2c9abac15a965199dac86c91dc925d093c2cfae56be31a36f55d5668"
