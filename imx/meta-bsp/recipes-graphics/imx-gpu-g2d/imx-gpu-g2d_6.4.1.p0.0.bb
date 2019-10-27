require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ec4bf430c4c490a8ba3fea8ac9b43172"
SRC_URI[aarch64.sha256sum] = "c9b85163f996e8d36669b794849c5176105b18ea69ef9dbca5797396863318f5"
SRC_URI[arm.md5sum] = "a37d1fdb28af064d803e63a3b3c0ed9a"
SRC_URI[arm.sha256sum] = "32d2784eea65802268d78a15d4ebd79cc3850575677eda65fe111a9a68760250"
