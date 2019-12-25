require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "551460b7b8aea6ecba49db942f903e2e"
SRC_URI[aarch64.sha256sum] = "77a4ade399489a51e7bc641a4da4e3168a4c3a0aa1266bab4bad1f6ff68a1f96"
SRC_URI[arm.md5sum] = "741bdefc98469da21ac4e33edaf35b46"
SRC_URI[arm.sha256sum] = "2ea3cb7aebce44c8e274130a56c1fd9c0bb4206aaa6b1891f341f333c8295693"
