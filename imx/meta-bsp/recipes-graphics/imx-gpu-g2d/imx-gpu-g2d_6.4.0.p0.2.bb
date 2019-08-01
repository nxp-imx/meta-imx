require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "bb1137214ce63e4c95fc2a52726d8c22"
SRC_URI[aarch64.sha256sum] = "def61a87ef5a7a7edea72a8869ccd95b3047c449e5a513ee354a545e2fbd5c9c"
SRC_URI[arm.md5sum] = "612cec451ee701c831f3f505ea3d14db"
SRC_URI[arm.sha256sum] = "c5753485dda4b23c0819c367c6131ec05a6ef7fc95a21b099d0c72d6f2ea83d9"
