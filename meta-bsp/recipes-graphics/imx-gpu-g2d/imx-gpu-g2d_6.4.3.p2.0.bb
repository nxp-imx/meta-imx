require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e0f91308edafc7e9aaab253250443a03"
SRC_URI[aarch64.sha256sum] = "1562158394ecd2326a5cd92306a3be00cc61189040e93f3d4ba680344c53cc52"
SRC_URI[arm.md5sum] = "b12c1bcd23501bde72f27823ac94d90d"
SRC_URI[arm.sha256sum] = "85d1aced6c2871b5f20398b2816538970baff9ecaa51412bb0ce261b1acc960f"
