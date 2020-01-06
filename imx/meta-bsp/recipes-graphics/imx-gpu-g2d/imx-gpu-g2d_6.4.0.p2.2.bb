require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7b031b58c23102e85036a0c9b0daf84d"
SRC_URI[aarch64.sha256sum] = "bf905de9604f2fc1af0d66073c66571948d633cda6f16a8646481bab0e1aa85b"
SRC_URI[arm.md5sum] = "13dd2ddb69da9e735d54e455a5bb5446"
SRC_URI[arm.sha256sum] = "8bf8d2e17430515bde1fe89aaa82f13b6216b86de8870b988ec5287ecc44fed7"
