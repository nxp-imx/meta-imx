require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b4f3ca07da2b9c6b7e15f9c88149689b"
SRC_URI[aarch64.sha256sum] = "87b4add04fab69a5fcce231fa2e3b63b9c22a32b8fdd154ff24dd0aa05318977"
SRC_URI[arm.md5sum] = "81caacb667d099e4f2135de426bfee24"
SRC_URI[arm.sha256sum] = "b15e68775b0469375232a2bb0c7c2d3b98c05e5d834c07c3468fa382df134a62"
