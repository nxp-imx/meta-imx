require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9fc11dcd663bbe54eaaadbd727b31703"
SRC_URI[aarch64.sha256sum] = "30ba7926375dfa1e43f203148f1d1d51881174a3cb1de7a81b00c61130ad730c"
SRC_URI[arm.md5sum] = "85bba00531d77f2921a339ef4eac1dfd"
SRC_URI[arm.sha256sum] = "278d8563a4285b29d830e040a0d1d23ff5e2a89bf4a8b89e7bc9a4e36aa4a935"
