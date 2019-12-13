require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8d01b3088c293842db2bd7ebaa9b4a8e"
SRC_URI[aarch64.sha256sum] = "6574020119b9e8b6a99fa673b7e7be3ea46b1f61f526fc3f41636e527cdbac62"
SRC_URI[arm.md5sum] = "46abf1dd775f33b7a60b001575f3bdb9"
SRC_URI[arm.sha256sum] = "9781f9b43186819e52dc30ff3d53e67ab44daabe77bd0541891a580a74dde657"
