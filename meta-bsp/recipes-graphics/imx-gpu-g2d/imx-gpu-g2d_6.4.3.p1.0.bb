require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "dabf4c995b5d0d59d8dc2508ce5b3fb3"
SRC_URI[aarch64.sha256sum] = "b1d9b00ec88f2bad293457bd03a3a4f271b56197b575a5e349e772ac4742c3ad"
SRC_URI[arm.md5sum] = "e13563cecfce7050d340bd4acf546995"
SRC_URI[arm.sha256sum] = "85a8420eb1fcdf719e7c74f9cf9ba0200257da14ea7fad6dd12eb11a25c06455"
