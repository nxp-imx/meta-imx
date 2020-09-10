require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "571999aa468e55caafc3d7ae24424c10"
SRC_URI[aarch64.sha256sum] = "8f67f10af865789d96d7cc694a3d0e0d012ff0ff07ef1cf899dca1f89761a106"
SRC_URI[arm.md5sum] = "53803b52af57d4f23f4b0f3c1f96d551"
SRC_URI[arm.sha256sum] = "e46b9cd15c87a9c4427b73a1154f4c72cc8434ea5c249465fe57218aef71f00b"
