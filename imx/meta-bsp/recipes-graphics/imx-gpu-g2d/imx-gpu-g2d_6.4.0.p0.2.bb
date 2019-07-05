require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "79fe07177a9854c9dbf3efda1d2006da"
SRC_URI[aarch64.sha256sum] = "66a8a42097920eda1a4a47545af998756e46226d472bb249a4e4fca8e595e594"
SRC_URI[arm.md5sum] = "66dfc34f4f9674b8f1348d7ff0377b2c"
SRC_URI[arm.sha256sum] = "1c36ee115b4ba44bb0fe34901eb8d80af9b070b3c677e6f3e745c1fa8388b54c"
