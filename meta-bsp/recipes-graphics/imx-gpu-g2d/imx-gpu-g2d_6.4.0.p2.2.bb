require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "3f77f0427893499057f13d909ca2633a"
SRC_URI[aarch64.sha256sum] = "dcc5ca09d4f7ceae82ca41fb0a1b8eab2981e27a33c58eae9cca1b5ab8321e8f"
SRC_URI[arm.md5sum] = "e47ff1da6264ef0bf3366eaabf1d3719"
SRC_URI[arm.sha256sum] = "37a920af8018dd3fba113657e1ec8b9ec2256bb506ef70e75378ba65b367d34d"
