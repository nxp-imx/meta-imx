require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "39118ddefd25a912b81163d736b96c97"
SRC_URI[aarch64.sha256sum] = "a3bc8d0f3432cba577d16a6b24c26b75725af3ea1be6568949171b46eb8c4e53"
SRC_URI[arm.md5sum] = "a66342eaef3ffacea38206bb526e383f"
SRC_URI[arm.sha256sum] = "749e9002bbf1856bd3a954d6619375e4b76f6c5d8e13ae0f2f2fd4a12f0dea7a"
