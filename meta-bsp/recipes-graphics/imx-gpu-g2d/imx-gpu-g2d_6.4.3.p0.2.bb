require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e701c79600bd4c700b374135a4449eba"
SRC_URI[aarch64.sha256sum] = "7999d58ee9889a1171488c6d6a240bce447324e3b3dd979de3fd29c5d3695b59"
SRC_URI[arm.md5sum] = "ed082d0febf0f2e141b9667a4021f79e"
SRC_URI[arm.sha256sum] = "f338b529309afca18b24123fef85cc946e3d2f6fb9bce2700583a9d097d2385c"
