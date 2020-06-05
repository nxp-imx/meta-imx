require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d2418d3cc76c86e887fd218a5e80f2c9"
SRC_URI[aarch64.sha256sum] = "a54fc2e33cc1e19223bfea1d52607962cf36a1860b5d1a21bfebf6ffc3da33d0"
SRC_URI[arm.md5sum] = "fd4b19cb86898cb1152298845a073426"
SRC_URI[arm.sha256sum] = "79bbc6df1d25e78f6be91db585fd120044973e191a49cdd700ac0f718a09f716"
