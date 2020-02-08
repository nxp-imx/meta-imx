require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e6286771d3111e0ca4e04e765a9d6324"
SRC_URI[aarch64.sha256sum] = "dd5b9adb1a8943f4ff69ee022a9fc288bbf5b248ab8eaed7b36fb6e4356e649c"
SRC_URI[arm.md5sum] = "1acb7eafbae6310f22b53aab2356c78b"
SRC_URI[arm.sha256sum] = "b502f9da84212b290f15dba19b56547e7a9a2a7e17699a9e158e7b1d763832c2"
