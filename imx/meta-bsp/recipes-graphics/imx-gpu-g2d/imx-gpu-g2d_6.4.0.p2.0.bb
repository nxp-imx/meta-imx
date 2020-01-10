require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f5639781a78ad6982b72e65573b5b945"
SRC_URI[aarch64.sha256sum] = "d44b46141b0d7e8798da9922b501ce41dd97c9860944d04725a69005d4987b9a"
SRC_URI[arm.md5sum] = "325473c7ea762827e15756136ba9405e"
SRC_URI[arm.sha256sum] = "cb30e349663d29c38e2cc0d974baf081a8da64e15505d4997a82a2a4c6cdefb8"
