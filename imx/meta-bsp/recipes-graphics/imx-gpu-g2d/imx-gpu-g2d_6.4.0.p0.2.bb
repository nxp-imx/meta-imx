require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7185b84704c97ac9e43b0e37a2eb8b4b"
SRC_URI[aarch64.sha256sum] = "9439dbd10e265e4e5b892ef404354fe5091fc6a9a89b48563906485e32482e83"
SRC_URI[arm.md5sum] = "1a9ee123494908e0536b638d39b41cda"
SRC_URI[arm.sha256sum] = "031afc4e7cabb91651a15c08f871656c4f40a4b6d7d020f30ba39f1ffc7848be"
