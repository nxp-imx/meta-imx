require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b0bf260cccfb27810c068abb2870b5cf"
SRC_URI[aarch64.sha256sum] = "86059c8d964fd7891b8942877e92fd1f46f8a305bb95b28a70142123df775b22"
SRC_URI[arm.md5sum] = "6c3774c41a2c6529a04014d21a34bf8f"
SRC_URI[arm.sha256sum] = "1616771b6f9fe140759d1462257ecb5cb5c3ff2ce8d80cb5e3d266e0cb1bbcb2"
