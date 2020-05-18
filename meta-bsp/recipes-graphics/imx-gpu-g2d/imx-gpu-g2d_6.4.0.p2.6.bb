require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8e19aedb326ffaf260f3567f8ffddb47"
SRC_URI[aarch64.sha256sum] = "902cb38a207a49e93d1b7877bffde78e9c06bb6606d9a8724be53643895f50ae"
SRC_URI[arm.md5sum] = "9d6e05ae3818afd522ca9d8b269b1290"
SRC_URI[arm.sha256sum] = "99a9f7ca6a3f2e4a3fb566171c976316f77507f1eb7e58a43d626af6a56a0c40"
