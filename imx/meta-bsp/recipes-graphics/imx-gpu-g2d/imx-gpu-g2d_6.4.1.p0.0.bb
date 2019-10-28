require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ec4bf430c4c490a8ba3fea8ac9b43172"
SRC_URI[aarch64.sha256sum] = "c9b85163f996e8d36669b794849c5176105b18ea69ef9dbca5797396863318f5"
SRC_URI[arm.md5sum] = "664cc3752b24d041f89426bb5f1e8d1b"
SRC_URI[arm.sha256sum] = "dc5230ecd86d43c026c2ac4ed0913581b00decb1cfae0e06d7905abd86ccccb4"
