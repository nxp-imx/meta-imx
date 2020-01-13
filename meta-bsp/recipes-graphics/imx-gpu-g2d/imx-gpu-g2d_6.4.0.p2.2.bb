require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6ab8c9cc823a4b71a568a594422a6bb6"
SRC_URI[aarch64.sha256sum] = "aef222fd13ed93002f503e56a60ef56f6eb1194ee96e52354d297e0a2738ae8f"
SRC_URI[arm.md5sum] = "5c15547fb6ecdd1dd3a162e4a8bf9c91"
SRC_URI[arm.sha256sum] = "c5246af7335fb1050335cd8cc722de50ccc1cf2e21df2d350f8bb5875c880370"
