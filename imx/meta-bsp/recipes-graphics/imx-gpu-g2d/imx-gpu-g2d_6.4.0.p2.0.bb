require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9c1c9fcde3a4388cfc4ae39ff8f4e638"
SRC_URI[aarch64.sha256sum] = "7f001a155e4b5ca56a5fd2d0b1387074b2535b0cc21ed5d31c6861e10f884908"
SRC_URI[arm.md5sum] = "25337a21c3a3874374091b90ef32528c"
SRC_URI[arm.sha256sum] = "642f429fc98422531acfe699be05bc545b85285d9016be9bceee01eaa2372dbc"
