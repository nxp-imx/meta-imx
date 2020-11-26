require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "c569ab4d92d97d2d6db546ed09f74c02"
SRC_URI[aarch64.sha256sum] = "5c7409eee36a7a9d5d1c4f973c0e3f7e824f9d74b8135772fa709e5f1cd7ab24"
SRC_URI[arm.md5sum] = "ad25363e0c65cdda81a6105a6a86abe8"
SRC_URI[arm.sha256sum] = "2f709ec5db88a3dca812f1f592406402383d6c57b091d7df02972c8ff96e19f2"
