require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "efa0fcde88d4cacd2279919591b41ca4"
SRC_URI[aarch64.sha256sum] = "19b69f49938eaf1c812707556bf806cc6d9905c72dd322e08e987f15e0d8b817"
SRC_URI[arm.md5sum] = "25337a21c3a3874374091b90ef32528c"
SRC_URI[arm.sha256sum] = "642f429fc98422531acfe699be05bc545b85285d9016be9bceee01eaa2372dbc"
