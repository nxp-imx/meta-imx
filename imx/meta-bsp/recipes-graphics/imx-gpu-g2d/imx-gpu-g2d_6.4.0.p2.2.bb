require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "762c79c0ae1f7e17805f8600c00b22cf"
SRC_URI[aarch64.sha256sum] = "b796409ee15e8fffc4ce6dcb3412a457917f0cdfc26b17fa14a2f73e1d069fa6"
SRC_URI[arm.md5sum] = "5850c1f7c903b960ff5fefa957c8f841"
SRC_URI[arm.sha256sum] = "5e863591d7bc7feb74727778f7ba34c67fa0815576fae38b51b69f74fee327f5"
