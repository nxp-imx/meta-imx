require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "49adfe81bdb1d1def9228bf6522eeb4e"
SRC_URI[aarch64.sha256sum] = "9498322376a1886d064c0f2c20b86b05ae82cd763d0c17862603d10ab3355835"
SRC_URI[arm.md5sum] = "fcfd5642ada7334de0135997ca01efe0"
SRC_URI[arm.sha256sum] = "51e188c81600e3d39ed188e295765a4dc3a91937550fc4d1c5a4be00257daba9"
