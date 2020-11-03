require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7e2a5604f566fe05401f88ff189ee39d"
SRC_URI[aarch64.sha256sum] = "ade9e0e25188ee2bce88b6b78cb708d17b3e186ca4576ad749cb48209216e4ee"
SRC_URI[arm.md5sum] = "534e9700db14803eafbe3b67e102efeb"
SRC_URI[arm.sha256sum] = "5491741058355bc2e6b04e3d4e172c6cdaa96d2cbc3c27f66b2b51dd6513b420"
