require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ebd1a6f4f3fc37f9ee404f1c233945ae"
SRC_URI[aarch64.sha256sum] = "e45ff8a0b0527f401dfbb0b1afc1484ae30f20fee5fd6d7aa12dfcdcb2e1ed25"
SRC_URI[arm.md5sum] = "5b9290475159daaf640c50b59c04a365"
SRC_URI[arm.sha256sum] = "24bcdb57b588809fae9160a59eef0e3e405f0b7734fe3224cf82db510c887b20"
