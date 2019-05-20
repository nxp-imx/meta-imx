require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6547b2ab560edee93a4bbf4e5e31d1e5"
SRC_URI[aarch64.sha256sum] = "95e1da6ad419e614de248fdbcc8acadb03fa22cff9aa6691e5640aa28a0aa475"
SRC_URI[arm.md5sum] = "4574b5f2bf61bed2c507ecb5fe088f73"
SRC_URI[arm.sha256sum] = "800756a15e249867fcbea9cf79153d99fc91e5bef53ab380ff5f22c3787ee4e7"
