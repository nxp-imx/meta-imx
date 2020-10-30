require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "1d492d4d36f455774db72361b5f2d73d"
SRC_URI[aarch64.sha256sum] = "c28b69fd7cb282e1de20e01caec4d2d0bc0f738c79092b8d12a19f3978a9737b"
SRC_URI[arm.md5sum] = "1aeb5c24d2a7a631dc9f545649ab63fa"
SRC_URI[arm.sha256sum] = "cbd65e2af53df3beb89393d36790cea5dedf4adb33c202227083887d031e68ab"
