require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "86d07a857505ac28f872d496412fdec2"
SRC_URI[aarch64.sha256sum] = "2ad69850260f187ac8937687a7bd1504cbfd6ce1c89737381b2920096fafe0ac"
SRC_URI[arm.md5sum] = "d1acf851e70222816e48db630dfa41de"
SRC_URI[arm.sha256sum] = "d70c2082d69e6d6b9ca07fbeca75c6238f18a984aca9ad13c07e0fbf99424332"
