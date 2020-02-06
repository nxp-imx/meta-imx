require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ca16b6ecb6a828d4ad4bf0a64b066314"
SRC_URI[aarch64.sha256sum] = "0056e0bdf98efbb64f3d2d0cf6a705564d3b1a6c872ba43d63ab15fc7ab5aebd"
SRC_URI[arm.md5sum] = "c1d67eb4e25f134cadc59c754f337b9c"
SRC_URI[arm.sha256sum] = "2fb2517696a0fcb24d5eb947c6162e1b7d0c869a735bbf328bd3bfeeeb15b7c6"
