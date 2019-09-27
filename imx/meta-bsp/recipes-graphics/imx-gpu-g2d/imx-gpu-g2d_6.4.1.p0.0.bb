require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8cb6290e8deffc1de6bd80f86e2a32d2"
SRC_URI[aarch64.sha256sum] = "92631d66d349d7339192b9e7b172123b4ac387eb74f9445008917e25785cb7e5"
SRC_URI[arm.md5sum] = "9bab21606564f3d8b02ae445da4c3572"
SRC_URI[arm.sha256sum] = "03265c84740941e530f4a9e7195504114700434b64b8a63f4de190f9a04cfd8a"
