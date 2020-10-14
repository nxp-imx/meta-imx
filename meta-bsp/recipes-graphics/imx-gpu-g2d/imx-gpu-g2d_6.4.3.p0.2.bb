require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e701c79600bd4c700b374135a4449eba"
SRC_URI[aarch64.sha256sum] = "7999d58ee9889a1171488c6d6a240bce447324e3b3dd979de3fd29c5d3695b59"
SRC_URI[arm.md5sum] = "634ceb293335aac0331e0e1f1635d4b8"
SRC_URI[arm.sha256sum] = "e61f0b229afa5f6f629fa5c99ee45f125384921b3418e4f3f6fef332436fb538"
