require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a2b8801a19320d0dc23262d954541ffa"
SRC_URI[aarch64.sha256sum] = "f09cfe534cc86fa94c4db1e46b6d7f8be3737a6cd16e8e62de29f39d8ba0a79e"
SRC_URI[arm.md5sum] = "bff6058e05104fbb5458c19e75b0d324"
SRC_URI[arm.sha256sum] = "6dc553f2011a832376f1107d8d43f036eccff07f1edff86ae91b3f870a9ad8bd"
