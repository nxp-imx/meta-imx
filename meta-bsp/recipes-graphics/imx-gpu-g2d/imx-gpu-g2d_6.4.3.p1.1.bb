require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "fb2c14d4b039e3e667933b8b5df66722"
SRC_URI[aarch64.sha256sum] = "b316535465e7fbca46e8107f9f26526990ca8408a6b7cf91c4745c95d806f754"
SRC_URI[arm.md5sum] = "5b7ffc539a83188f6bbdb286881f3ed4"
SRC_URI[arm.sha256sum] = "33c41f53a540aeb1342d26a14a6911fddf51a4e43843305032d1d3c0b45d6c66"
