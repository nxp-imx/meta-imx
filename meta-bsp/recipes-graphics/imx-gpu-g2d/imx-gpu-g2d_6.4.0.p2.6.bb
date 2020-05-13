require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e8c5b8a627d36a02a54861d06599a0f9"
SRC_URI[aarch64.sha256sum] = "b9269a4952ab07c0f6aba558be2c39587715380ff9400414d494953e66b562cc"
SRC_URI[arm.md5sum] = "aca91b98e128a7bce7290319c3cf5350"
SRC_URI[arm.sha256sum] = "bc91fc892316db9aac849f6fef3d531a081c7d48f3f2d34bdd427adefda6ce75"
