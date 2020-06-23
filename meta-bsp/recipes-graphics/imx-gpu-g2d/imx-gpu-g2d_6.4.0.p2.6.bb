require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7018e9c6ae4fec1c6b0d7c7fcd6735c5"
SRC_URI[aarch64.sha256sum] = "e1a6e7ca22efa12c82500c2ae771b3ba45590bc9c96165f1724234ac2891a1e2"
SRC_URI[arm.md5sum] = "e25b463b45eae11dfd3b2557255b1d1a"
SRC_URI[arm.sha256sum] = "ef91e95e14e10b343fbd7580bacede317eb5b61ad318b68a30b676fa20917ab9"
