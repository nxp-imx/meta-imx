require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9461abf201e0371f13d55163acca1188"
SRC_URI[aarch64.sha256sum] = "958b6e95385aafc26147c7d15440ea9a9323b52a6c0efc5d69153cd9d4065c00"
SRC_URI[arm.md5sum] = "ef108abc75b9c86af50d2664a8e58ad0"
SRC_URI[arm.sha256sum] = "10e89ef27e14e5e0193735bcb91f527cfa881bdd60c2c0632533462614b5bb0c"
