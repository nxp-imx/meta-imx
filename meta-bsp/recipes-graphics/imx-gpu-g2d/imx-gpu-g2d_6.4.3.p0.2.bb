require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "c9448c5404dc3d7cbc3e8e1db757cfc7"
SRC_URI[aarch64.sha256sum] = "3887ee6cec9a53504191a6eacd499577ce31a87c737d8ebdb5eac5997de7b2a1"
SRC_URI[arm.md5sum] = "e290531c426edb418bf8ee1c0edc3dcb"
SRC_URI[arm.sha256sum] = "c4ce8420a1db5f4f53ddd97ed2119ca69232abb48578d7ce2681c0bae24720d6"
