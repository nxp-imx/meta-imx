require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a07305d0dd7a79e373793deb13585fab"
SRC_URI[aarch64.sha256sum] = "6c17d2d560c639ddf7c894a4b125b38719fc0d1454f634ca8361fdfea26e82cc"
SRC_URI[arm.md5sum] = "35e923572d3e477d5f933ed407e5df8d"
SRC_URI[arm.sha256sum] = "91c05742af37b2c30f8e19a836e49fab7e1e1bb236608d450057fc9cf73404fd"
