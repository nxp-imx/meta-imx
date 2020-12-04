require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "897f43455894be3c3450772a0f6b6e01"
SRC_URI[aarch64.sha256sum] = "0168349f39e60ece8163ed78353d088c46f0f5f1bc0c63b502f053ec39aae685"
SRC_URI[arm.md5sum] = "da41c748d59592a9afd13c5c0386948b"
SRC_URI[arm.sha256sum] = "68f4b0aff982852fe3fe96d48861b7ade1fd2f189cbc55acc52830746c420a37"
