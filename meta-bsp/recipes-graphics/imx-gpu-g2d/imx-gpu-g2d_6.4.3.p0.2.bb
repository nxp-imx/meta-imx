require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "dbb32c4d7c16c33f9c0c4921db107dc4"
SRC_URI[aarch64.sha256sum] = "83969106e1658b12c92ba7650569c7a46dec96bd8394a02044725a55abd009fd"
SRC_URI[arm.md5sum] = "53803b52af57d4f23f4b0f3c1f96d551"
SRC_URI[arm.sha256sum] = "e46b9cd15c87a9c4427b73a1154f4c72cc8434ea5c249465fe57218aef71f00b"
