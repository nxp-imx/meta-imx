require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "46a25ffb33312b36b4c1b8dea38c05f4"
SRC_URI[aarch64.sha256sum] = "3278d4e2bae91e86d148c7e142178d50d4d8eb476fc1ee4a2e265f7e66334741"
SRC_URI[arm.md5sum] = "69532382092c1a5e754be594d1a486b7"
SRC_URI[arm.sha256sum] = "c618c3ac6adc5f28439ceb88cb46889b78daaf36655ab82ea2ac6f50a88297f5"
