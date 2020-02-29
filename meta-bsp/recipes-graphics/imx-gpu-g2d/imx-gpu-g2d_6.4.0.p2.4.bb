require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "1305a64613d5b5aa2541c8d62fb58641"
SRC_URI[aarch64.sha256sum] = "b89ce44a19d4b7536700731292ac12ae22ee97137f5d67f818571598e6edd481"
SRC_URI[arm.md5sum] = "9de932860a8447f43af07196ccc408d8"
SRC_URI[arm.sha256sum] = "c6a81ad058f917b9bcc85804a18c939091ad362f189fa090f0f5cc08e9e13d3c"
