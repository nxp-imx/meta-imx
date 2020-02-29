require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d9bf014f7ed47e783031380489d1d415"
SRC_URI[aarch64.sha256sum] = "a491eb2b80c83d8c44ba42c025f711b57dacf7d145fde4edd9bda367c5d26137"
SRC_URI[arm.md5sum] = "9de932860a8447f43af07196ccc408d8"
SRC_URI[arm.sha256sum] = "c6a81ad058f917b9bcc85804a18c939091ad362f189fa090f0f5cc08e9e13d3c"
