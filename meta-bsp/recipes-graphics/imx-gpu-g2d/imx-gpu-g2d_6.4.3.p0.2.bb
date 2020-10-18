require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "4c654f251b5dc230fe6498910069e475"
SRC_URI[aarch64.sha256sum] = "71339338219b25c3ca7e5292703ed71e264cad6a988168ae786d8e6b2fa38c30"
SRC_URI[arm.md5sum] = "ed082d0febf0f2e141b9667a4021f79e"
SRC_URI[arm.sha256sum] = "f338b529309afca18b24123fef85cc946e3d2f6fb9bce2700583a9d097d2385c"
