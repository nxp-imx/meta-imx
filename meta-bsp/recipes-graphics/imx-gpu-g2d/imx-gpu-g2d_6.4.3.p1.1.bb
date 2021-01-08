require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5f13ca129c40367eec9678cd461fb741"
SRC_URI[aarch64.sha256sum] = "27d2d1274b7ff5c7c22651f9577a448ed46d61e9396a9e841e87103a779d1b74"
SRC_URI[arm.md5sum] = "ec3036747b2d22adcf02201f032dfedf"
SRC_URI[arm.sha256sum] = "ad8ae57cf8cf797995c70f87ed7fa290b4c8438b1e96bdd1e7f6c2fcb3c5e206"
