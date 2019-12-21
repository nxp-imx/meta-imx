require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f457c9e0a3142950755222620109a19e"
SRC_URI[aarch64.sha256sum] = "000dadfab96081a4fd6332aff0cc8e27aa0ec348bdacdd07a81de9a847b651f6"
SRC_URI[arm.md5sum] = "eeaaee89e76aea28c37902c4164d04cf"
SRC_URI[arm.sha256sum] = "399d1c0872455255230f40f9efe55a67ef89a0ad5c959f033cfb68e15617dfa4"
