require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "963b0b2afc579ed84885fd766f374b18"
SRC_URI[aarch64.sha256sum] = "c733972b43fdfca6c4ca9c06b841da6b162b9d58564a3fb1a672bb0c7261d05b"
SRC_URI[arm.md5sum] = "9bab21606564f3d8b02ae445da4c3572"
SRC_URI[arm.sha256sum] = "03265c84740941e530f4a9e7195504114700434b64b8a63f4de190f9a04cfd8a"
