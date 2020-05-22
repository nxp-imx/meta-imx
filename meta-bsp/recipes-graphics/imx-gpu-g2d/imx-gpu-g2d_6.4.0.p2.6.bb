require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8e19aedb326ffaf260f3567f8ffddb47"
SRC_URI[aarch64.sha256sum] = "902cb38a207a49e93d1b7877bffde78e9c06bb6606d9a8724be53643895f50ae"
SRC_URI[arm.md5sum] = "81a9cccadd17652e206975b90d7a52df"
SRC_URI[arm.sha256sum] = "fdd468280f3e22482c10032bf72c8ef8e53dd74ba602581bc321656ac822d419"
