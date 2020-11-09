require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "51d72331abb805b67b98bcab30e0ed6a"
SRC_URI[aarch64.sha256sum] = "56559593a5d80396f94a95608cd6237bdc73aaa08ac3718e11bbb9230f379995"
SRC_URI[arm.md5sum] = "317c611cadd64ee065d085a0965134d5"
SRC_URI[arm.sha256sum] = "7498898ffb389b92e65daa84a7589ea814110da47be5bcc63d586943137a628e"
