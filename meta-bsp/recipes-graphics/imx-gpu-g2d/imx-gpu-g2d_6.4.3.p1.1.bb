require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "621f08d0d6ac27aae99964f1659b4e5e"
SRC_URI[aarch64.sha256sum] = "69f3552d89256db14fe433ce07d271c225b6ab13c8287dd52179aab8d4066473"
SRC_URI[arm.md5sum] = "9e3bd0da21f24c75edf368fbcacdc76b"
SRC_URI[arm.sha256sum] = "2b9cb668de16293f5070a8b3e651f82996a3c17e41285bb4faacb9c38e58685d"
