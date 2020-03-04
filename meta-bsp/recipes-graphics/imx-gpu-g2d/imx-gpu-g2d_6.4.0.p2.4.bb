require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "44f71e1d8a0ae2f5d336f9a7b2dbd057"
SRC_URI[aarch64.sha256sum] = "ce62e6ba5cfd65a1476fc84eeda26620f7d36dbf3a540c9a71ffafdf335fb548"
SRC_URI[arm.md5sum] = "54d9c62241049b17d6c517dfd87bf7ee"
SRC_URI[arm.sha256sum] = "07b0111cee97c8664867ef987694e493dd427309892d270c7eaee9ea8b737640"
