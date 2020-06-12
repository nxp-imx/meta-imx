require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "fc369f12e14a291c06101aa6682e04b2"
SRC_URI[aarch64.sha256sum] = "b28fd43e2bab20100c4c6d812082f33e58396a328db247694e1d4a5f76ce5323"
SRC_URI[arm.md5sum] = "a592f8f169dea6e3694bd0bbfb02f637"
SRC_URI[arm.sha256sum] = "3bf06198683ed3ff3b0628924f68530ed6b9084851129f7b7a49371b60ecffbb"
