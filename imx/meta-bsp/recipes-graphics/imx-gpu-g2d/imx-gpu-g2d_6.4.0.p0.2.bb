require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "fe55a1b51fd74196e160d6886b9aaeba"
SRC_URI[aarch64.sha256sum] = "89b74cad430a53d8bcb0eeffc7582fd3029303aa79aed8113f6661d3b4766602"
SRC_URI[arm.md5sum] = "1a9ee123494908e0536b638d39b41cda"
SRC_URI[arm.sha256sum] = "031afc4e7cabb91651a15c08f871656c4f40a4b6d7d020f30ba39f1ffc7848be"
