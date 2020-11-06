require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "51d72331abb805b67b98bcab30e0ed6a"
SRC_URI[aarch64.sha256sum] = "56559593a5d80396f94a95608cd6237bdc73aaa08ac3718e11bbb9230f379995"
SRC_URI[arm.md5sum] = "f8c47b4f422bf2115d52a765396a6a62"
SRC_URI[arm.sha256sum] = "3b8b472066b18639ac3b943326df78206780944409f251846c927aacecda500e"
