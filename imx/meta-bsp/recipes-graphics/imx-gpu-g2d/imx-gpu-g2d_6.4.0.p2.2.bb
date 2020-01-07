require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6c1a968c165e181d934e4ba2be61b0c0"
SRC_URI[aarch64.sha256sum] = "8278ef56eadb5e1a4115ec67205fb93242fe7816e6afc8cb41f8d5c121f1e2b7"
SRC_URI[arm.md5sum] = "d1acf851e70222816e48db630dfa41de"
SRC_URI[arm.sha256sum] = "d70c2082d69e6d6b9ca07fbeca75c6238f18a984aca9ad13c07e0fbf99424332"
