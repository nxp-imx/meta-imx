require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "243b09109ec64fdb7686be13392d6d31"
SRC_URI[aarch64.sha256sum] = "ed8d75df6c2ecfadbcc2e1b78c5323ee267f688ded28c9fa762b808bbd138ed5"
SRC_URI[arm.md5sum] = "9d6e05ae3818afd522ca9d8b269b1290"
SRC_URI[arm.sha256sum] = "99a9f7ca6a3f2e4a3fb566171c976316f77507f1eb7e58a43d626af6a56a0c40"
