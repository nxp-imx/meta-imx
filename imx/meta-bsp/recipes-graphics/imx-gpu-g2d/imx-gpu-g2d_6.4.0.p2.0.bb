require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "62b48b717bc798bece618e46f8b380cf"
SRC_URI[aarch64.sha256sum] = "3f100d269475520046a6a5c4ff871b3dc7d696e1d159eea5c1cd25876343e13a"
SRC_URI[arm.md5sum] = "c7f1d7534a0a971d5fe5fe05c21d711f"
SRC_URI[arm.sha256sum] = "5aefa10c4e92c05a54911a05174a4fbca00779dd2f009fc3c050315508527267"
