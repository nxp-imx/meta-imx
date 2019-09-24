require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "0ac2c73406f989ec36b6493e14d65f4f"
SRC_URI[aarch64.sha256sum] = "8ffe0e3d161f3ce1cd3de5a6a296726101e2cf97b3eeaa5a854b9e6cb1c351c0"
SRC_URI[arm.md5sum] = "acd3f755ebb8f4a07b15bc2a0395a81d"
SRC_URI[arm.sha256sum] = "000a286eb5fcf4a52eedcf67e6ee14ea3d1dab34acaa6d7f461ac59a224fa67c"
