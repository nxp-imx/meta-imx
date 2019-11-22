require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9ea085100901f79f91cdd1bc6cb1fd35"
SRC_URI[aarch64.sha256sum] = "12ee7f15a5f43b2ab4311b4f1a4d4412b83690c9cf07ba6bb3b8b2d27defee45"
SRC_URI[arm.md5sum] = "43247b168c447d3ed20710080810d04d"
SRC_URI[arm.sha256sum] = "b2e35b9478bc169728f9268ee1cf037320ddd423da9efa48e0a92c5653598306"
