require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "993e6c1fec51d9aca12238f9f86a509d"
SRC_URI[aarch64.sha256sum] = "a2e140bfbdf582070d42b6a8ad7b2e233497ca192a686d20685a5216e1050b45"
SRC_URI[arm.md5sum] = "66dfc34f4f9674b8f1348d7ff0377b2c"
SRC_URI[arm.sha256sum] = "1c36ee115b4ba44bb0fe34901eb8d80af9b070b3c677e6f3e745c1fa8388b54c"
