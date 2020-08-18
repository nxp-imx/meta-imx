require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8ab81fc564e954708eef69bbe179e217"
SRC_URI[aarch64.sha256sum] = "1ffc04cb08eb6c43b8b2ee51a1d1e36d481f1c1ff48e9d5a9410a9a8f6f16e22"
SRC_URI[arm.md5sum] = "fcfd5642ada7334de0135997ca01efe0"
SRC_URI[arm.sha256sum] = "51e188c81600e3d39ed188e295765a4dc3a91937550fc4d1c5a4be00257daba9"
