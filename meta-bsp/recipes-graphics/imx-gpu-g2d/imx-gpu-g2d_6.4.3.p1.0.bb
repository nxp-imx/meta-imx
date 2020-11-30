require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "69b1a2798419fde10908952e19b6f0ff"
SRC_URI[aarch64.sha256sum] = "bb87b360040a4ff29ece226ed37d867f23ef2eaf2ff5ef9302d782c7b76bb049"
SRC_URI[arm.md5sum] = "bba6f776fe7f306d7ebadf09ea4c7c75"
SRC_URI[arm.sha256sum] = "2dc2e944b126e7e0a3e78a8b2acd28f6eefb6698faef9e9e953a7eedf06e1681"
