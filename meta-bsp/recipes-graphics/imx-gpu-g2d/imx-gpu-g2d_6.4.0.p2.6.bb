require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d2418d3cc76c86e887fd218a5e80f2c9"
SRC_URI[aarch64.sha256sum] = "a54fc2e33cc1e19223bfea1d52607962cf36a1860b5d1a21bfebf6ffc3da33d0"
SRC_URI[arm.md5sum] = "87664d284e98e564bd03f9a498d00f40"
SRC_URI[arm.sha256sum] = "82a0782fca9de02636688eca9c93a5e5a84311a9134d92ae29b9b82c49e90622"
