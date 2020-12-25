require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "39118ddefd25a912b81163d736b96c97"
SRC_URI[aarch64.sha256sum] = "a3bc8d0f3432cba577d16a6b24c26b75725af3ea1be6568949171b46eb8c4e53"
SRC_URI[arm.md5sum] = "f94de4871d5b9002514c2495019659ee"
SRC_URI[arm.sha256sum] = "e6c75f5eeaf61e6d7033bd4b9c985fd61dda07d9dbe0163c91fdb020b0dfbfb7"
