require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e9ace3a309e0af146a785665e5cfa054"
SRC_URI[aarch64.sha256sum] = "5e1203c7ce8ecd87ddbafd78a17e5e9d0dfcecbc4d407394c281e511eb844788"
SRC_URI[arm.md5sum] = "e25b463b45eae11dfd3b2557255b1d1a"
SRC_URI[arm.sha256sum] = "ef91e95e14e10b343fbd7580bacede317eb5b61ad318b68a30b676fa20917ab9"
