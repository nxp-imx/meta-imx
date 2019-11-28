require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6f7aec45d90071246cf19bdca55fc363"
SRC_URI[aarch64.sha256sum] = "1197e083dd674ad54f532e5edda024a5d9112376ab68100a2a7bedc4ac823682"
SRC_URI[arm.md5sum] = "30b2117fefa9228f72576b2400fbee2b"
SRC_URI[arm.sha256sum] = "7bd2a0bed3545151428a8a7ffac2984a911b2c31846798dfb400a980ac3f0753"
