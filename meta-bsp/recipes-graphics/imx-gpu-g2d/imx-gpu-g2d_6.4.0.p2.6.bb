require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e8c5b8a627d36a02a54861d06599a0f9"
SRC_URI[aarch64.sha256sum] = "b9269a4952ab07c0f6aba558be2c39587715380ff9400414d494953e66b562cc"
SRC_URI[arm.md5sum] = "bbd7ea1d3d0673a3fd1f83782c5fab4d"
SRC_URI[arm.sha256sum] = "0aa178daf66023038078479a4f8cfb722d0cbba20a2da8fbe563d0e8785369a0"
