require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "18b2d641fb1e9f585dd0d9f7526496a3"
SRC_URI[aarch64.sha256sum] = "40b9b4bcae5c5ddf47686f04c737b34b7bc580bdfb6c4a631e0ea9f3c9456f6c"
SRC_URI[arm.md5sum] = "5bd08ffdcecdfec52c192b02181dc26e"
SRC_URI[arm.sha256sum] = "75e708c456e51cf2a264ec6836735d809462fb2593f2885e2e922ac455383d22"
