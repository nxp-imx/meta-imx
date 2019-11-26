require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f3b8e2c4f1b3cd205dac7bfce98d1bc2"
SRC_URI[aarch64.sha256sum] = "17bdbb62c532a3e9b419a76777762f087b1a962adc2d1970b9a65d38b6b305f2"
SRC_URI[arm.md5sum] = "30b2117fefa9228f72576b2400fbee2b"
SRC_URI[arm.sha256sum] = "7bd2a0bed3545151428a8a7ffac2984a911b2c31846798dfb400a980ac3f0753"
