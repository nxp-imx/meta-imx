require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "50919c15994cec935d8154c68c0272af"
SRC_URI[aarch64.sha256sum] = "5a1e312fa11bd01e6d8da966884250ebabecae94da01e8073bc310830855c591"
SRC_URI[arm.md5sum] = "51ff66e34b8fd809c4b710687dec8057"
SRC_URI[arm.sha256sum] = "7ddcd426cb66db4fe244d90d3900d5ca4aa34015a23b89ecc3edb7e828d9e57d"
