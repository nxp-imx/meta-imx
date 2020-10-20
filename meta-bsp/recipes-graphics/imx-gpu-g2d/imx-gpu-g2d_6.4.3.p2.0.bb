require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "eff04d8fe71497018d6e004f44ada8cd"
SRC_URI[aarch64.sha256sum] = "b4f7ab8dca95449cf61135b72465664264ab238be8cf9eaff8f06ab94bca1cad"
SRC_URI[arm.md5sum] = "ed082d0febf0f2e141b9667a4021f79e"
SRC_URI[arm.sha256sum] = "f338b529309afca18b24123fef85cc946e3d2f6fb9bce2700583a9d097d2385c"
