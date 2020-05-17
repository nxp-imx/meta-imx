require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "243b09109ec64fdb7686be13392d6d31"
SRC_URI[aarch64.sha256sum] = "ed8d75df6c2ecfadbcc2e1b78c5323ee267f688ded28c9fa762b808bbd138ed5"
SRC_URI[arm.md5sum] = "bbd7ea1d3d0673a3fd1f83782c5fab4d"
SRC_URI[arm.sha256sum] = "0aa178daf66023038078479a4f8cfb722d0cbba20a2da8fbe563d0e8785369a0"
