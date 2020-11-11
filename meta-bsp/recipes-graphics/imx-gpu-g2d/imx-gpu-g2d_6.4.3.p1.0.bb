require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "78c77b7214c99128a8607d61dd36081f"
SRC_URI[aarch64.sha256sum] = "b5f253e10a9651c9afbcf01e90b671b391163a012d8b347e356c0964645307eb"
SRC_URI[arm.md5sum] = "5f1a132b83f2c6f5ab883bc9df72bd0f"
SRC_URI[arm.sha256sum] = "9f37416c5ae5c9510e2a8de654917355174415ab1cc142a29c78f885b0bbf96d"
