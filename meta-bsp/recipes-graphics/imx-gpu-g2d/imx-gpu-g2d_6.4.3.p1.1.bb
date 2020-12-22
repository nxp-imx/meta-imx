require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "39118ddefd25a912b81163d736b96c97"
SRC_URI[aarch64.sha256sum] = "a3bc8d0f3432cba577d16a6b24c26b75725af3ea1be6568949171b46eb8c4e53"
SRC_URI[arm.md5sum] = "4ece903840ec7f23d296f30bd7a3ad82"
SRC_URI[arm.sha256sum] = "5502a17d491c74d1a69985acf995d9ff54050dd8039efee23fc857f4b0ae7c1b"
