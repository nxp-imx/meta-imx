require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d2418d3cc76c86e887fd218a5e80f2c9"
SRC_URI[aarch64.sha256sum] = "a54fc2e33cc1e19223bfea1d52607962cf36a1860b5d1a21bfebf6ffc3da33d0"
SRC_URI[arm.md5sum] = "fc4630f7bd2056f1241a54da071bf031"
SRC_URI[arm.sha256sum] = "0f17678f7164646a8125b4fdefd7eb9ba9014d190b169b7838648cccda8c77b9"
