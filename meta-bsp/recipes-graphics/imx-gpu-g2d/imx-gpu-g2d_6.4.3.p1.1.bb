require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "43769400a87eaf86c0097e9d005466c0"
SRC_URI[aarch64.sha256sum] = "8a28b1c57a153d56537951defddfa475c2aa4cc9b4d5ff098d0093d0bb4c7c72"
SRC_URI[arm.md5sum] = "bd6d2b8b77ad7da0b9a2919dc62ff19d"
SRC_URI[arm.sha256sum] = "4de03eddd8937288e0a03f97f04d498aa10f72121b4aa6d91498dfdfc4d8b8f9"
