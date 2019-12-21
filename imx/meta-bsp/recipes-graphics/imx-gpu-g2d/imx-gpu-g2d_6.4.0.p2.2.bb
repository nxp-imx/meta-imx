require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "68c6a40e703656d4fdf2f5de33180dd9"
SRC_URI[aarch64.sha256sum] = "bb214ecc2ae9b95c89e087d2f60e1dc9522d54566e2d1aaa2c2a054909d59136"
SRC_URI[arm.md5sum] = "eeaaee89e76aea28c37902c4164d04cf"
SRC_URI[arm.sha256sum] = "399d1c0872455255230f40f9efe55a67ef89a0ad5c959f033cfb68e15617dfa4"
