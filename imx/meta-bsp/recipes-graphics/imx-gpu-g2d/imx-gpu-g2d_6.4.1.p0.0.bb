require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b4f3ca07da2b9c6b7e15f9c88149689b"
SRC_URI[aarch64.sha256sum] = "87b4add04fab69a5fcce231fa2e3b63b9c22a32b8fdd154ff24dd0aa05318977"
SRC_URI[arm.md5sum] = "8f09ea609301cc10ac434a51da76e1c3"
SRC_URI[arm.sha256sum] = "c0abd4664440839639404aaeb90e89c674de674108347be699b8590295d8212a"
