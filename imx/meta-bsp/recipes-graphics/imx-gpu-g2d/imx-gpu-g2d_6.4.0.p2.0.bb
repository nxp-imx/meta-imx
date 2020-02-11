require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ca16b6ecb6a828d4ad4bf0a64b066314"
SRC_URI[aarch64.sha256sum] = "0056e0bdf98efbb64f3d2d0cf6a705564d3b1a6c872ba43d63ab15fc7ab5aebd"
SRC_URI[arm.md5sum] = "eeb8305e156507337bfc3cb84e7d80a5"
SRC_URI[arm.sha256sum] = "2ac3335df53d2064f22a779346374b6198802fd75d7590663eff38caa12744b7"
