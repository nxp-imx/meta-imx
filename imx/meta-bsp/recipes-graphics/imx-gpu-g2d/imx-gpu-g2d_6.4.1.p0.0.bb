require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "bd25241e4be70e1515376e16e5635d30"
SRC_URI[aarch64.sha256sum] = "cd9db7725c8a5897ea8d14d5fedcbfc6cfbd213b2698f1ada30a0211b37a56d1"
SRC_URI[arm.md5sum] = "9ca6a515706fa7c1e52d9c4521c055b8"
SRC_URI[arm.sha256sum] = "38221f079514bbdb168df6f1d6fef3572700fb3ffe3e1e620a48cbe740f26ed7"
