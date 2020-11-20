require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e14563d7d4f9eccc1e74a8dc4e696c2a"
SRC_URI[aarch64.sha256sum] = "244b38408ff0b8616cb0615bf26ab2e8dbc47095aa7b7f5a479453fb5f5d48ae"
SRC_URI[arm.md5sum] = "36b2cdc2fc14c9d962c6cd6f9282d76f"
SRC_URI[arm.sha256sum] = "4631d7ba76061e9e98a32db50c5a7c9bd3300f345a14a190b98a53ec77b85be4"
