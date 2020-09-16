require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "4d01650ac6b40360931c26357b62d1f0"
SRC_URI[aarch64.sha256sum] = "2b0a69cd84c2e0f7feb1b3f6f8a3f7f1fb503ea52b93c40fd9938793623805b5"
SRC_URI[arm.md5sum] = "e290531c426edb418bf8ee1c0edc3dcb"
SRC_URI[arm.sha256sum] = "c4ce8420a1db5f4f53ddd97ed2119ca69232abb48578d7ce2681c0bae24720d6"
