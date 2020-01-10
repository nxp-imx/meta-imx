require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f5639781a78ad6982b72e65573b5b945"
SRC_URI[aarch64.sha256sum] = "d44b46141b0d7e8798da9922b501ce41dd97c9860944d04725a69005d4987b9a"
SRC_URI[arm.md5sum] = "b57c0855a30781026df5fff6b6139f10"
SRC_URI[arm.sha256sum] = "ef7bfe52b6009553a3ea9217882445c49ea37c6aece19a3293b2c465a05264cd"
