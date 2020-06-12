require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7491162aa46eea594af42d1ad4e4d317"
SRC_URI[aarch64.sha256sum] = "aea32555ee5129ffcbbdbd75177c208b1866deb4dc2ea4cc11620b4246b54b6a"
SRC_URI[arm.md5sum] = "a592f8f169dea6e3694bd0bbfb02f637"
SRC_URI[arm.sha256sum] = "3bf06198683ed3ff3b0628924f68530ed6b9084851129f7b7a49371b60ecffbb"
