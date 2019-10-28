require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5711c5337a9b90108fa2914be2924ddd"
SRC_URI[aarch64.sha256sum] = "36de33ea9bd33e56e3cf53a6b74be6c8ef8b6a488afc1f4308e7cb85cb60badc"
SRC_URI[arm.md5sum] = "664cc3752b24d041f89426bb5f1e8d1b"
SRC_URI[arm.sha256sum] = "dc5230ecd86d43c026c2ac4ed0913581b00decb1cfae0e06d7905abd86ccccb4"
