require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "fb2c14d4b039e3e667933b8b5df66722"
SRC_URI[aarch64.sha256sum] = "b316535465e7fbca46e8107f9f26526990ca8408a6b7cf91c4745c95d806f754"
SRC_URI[arm.md5sum] = "be5f02f640cb05fc1b4a93adf79d95df"
SRC_URI[arm.sha256sum] = "61975ff530b22f7492cd04f622fdcb0d7563ba423984a24ecf6be4a83c4912d7"
