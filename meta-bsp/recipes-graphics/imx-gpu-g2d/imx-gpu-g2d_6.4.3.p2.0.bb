require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "cccc646f7b3ad2486b7bc2195540d6a7"
SRC_URI[aarch64.sha256sum] = "5e33775af625615eb404046bab808d4b85b710943343e0a3ef65fd4522ebba33"
SRC_URI[arm.md5sum] = "51ff66e34b8fd809c4b710687dec8057"
SRC_URI[arm.sha256sum] = "7ddcd426cb66db4fe244d90d3900d5ca4aa34015a23b89ecc3edb7e828d9e57d"
