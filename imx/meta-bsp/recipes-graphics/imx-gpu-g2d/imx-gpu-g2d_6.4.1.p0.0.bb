require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5711c5337a9b90108fa2914be2924ddd"
SRC_URI[aarch64.sha256sum] = "36de33ea9bd33e56e3cf53a6b74be6c8ef8b6a488afc1f4308e7cb85cb60badc"
SRC_URI[arm.md5sum] = "9ca6a515706fa7c1e52d9c4521c055b8"
SRC_URI[arm.sha256sum] = "38221f079514bbdb168df6f1d6fef3572700fb3ffe3e1e620a48cbe740f26ed7"
