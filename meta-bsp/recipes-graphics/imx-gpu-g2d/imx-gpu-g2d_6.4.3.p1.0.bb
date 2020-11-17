require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e14563d7d4f9eccc1e74a8dc4e696c2a"
SRC_URI[aarch64.sha256sum] = "244b38408ff0b8616cb0615bf26ab2e8dbc47095aa7b7f5a479453fb5f5d48ae"
SRC_URI[arm.md5sum] = "6380917a12e6f016456152b7035bc7b2"
SRC_URI[arm.sha256sum] = "cd10c562008528ff88a91aa836b812a9fc306ea54b0d152bad96dcadfe2859c5"
