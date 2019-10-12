require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6a683840f64a03342f1fd3382e45ba60"
SRC_URI[aarch64.sha256sum] = "3996cc736844753b78f0d73ee6eae9e32b5b9c52c8b366c1f5d4e2982857d6de"
SRC_URI[arm.md5sum] = "672392e87b7c9e8c3ab0f1caef774c6c"
SRC_URI[arm.sha256sum] = "3c58692df085dc5bcc6c07fb54d75714424fe95c3dc8431350b39c3478ed5175"
