require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5a5edafbcf28010ca8b9cf7cbd4780b3"
SRC_URI[aarch64.sha256sum] = "d572e7e558999dce589abf0614e8dbf61b13e0c1d692285ac865c14ff489a9fa"
SRC_URI[arm.md5sum] = "bff6058e05104fbb5458c19e75b0d324"
SRC_URI[arm.sha256sum] = "6dc553f2011a832376f1107d8d43f036eccff07f1edff86ae91b3f870a9ad8bd"
