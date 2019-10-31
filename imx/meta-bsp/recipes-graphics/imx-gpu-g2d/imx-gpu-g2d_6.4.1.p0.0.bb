require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "bd25241e4be70e1515376e16e5635d30"
SRC_URI[aarch64.sha256sum] = "cd9db7725c8a5897ea8d14d5fedcbfc6cfbd213b2698f1ada30a0211b37a56d1"
SRC_URI[arm.md5sum] = "8f09ea609301cc10ac434a51da76e1c3"
SRC_URI[arm.sha256sum] = "c0abd4664440839639404aaeb90e89c674de674108347be699b8590295d8212a"
