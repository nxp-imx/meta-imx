require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6c1a968c165e181d934e4ba2be61b0c0"
SRC_URI[aarch64.sha256sum] = "8278ef56eadb5e1a4115ec67205fb93242fe7816e6afc8cb41f8d5c121f1e2b7"
SRC_URI[arm.md5sum] = "13dd2ddb69da9e735d54e455a5bb5446"
SRC_URI[arm.sha256sum] = "8bf8d2e17430515bde1fe89aaa82f13b6216b86de8870b988ec5287ecc44fed7"
