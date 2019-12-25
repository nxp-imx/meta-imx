require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "62b48b717bc798bece618e46f8b380cf"
SRC_URI[aarch64.sha256sum] = "3f100d269475520046a6a5c4ff871b3dc7d696e1d159eea5c1cd25876343e13a"
SRC_URI[arm.md5sum] = "96c50ddb73304cc20789eab7e4a34cb4"
SRC_URI[arm.sha256sum] = "eda7d0ab636f639549303cf5f30455ea6ef4cdea7bb6f123cd02ce597887628c"
