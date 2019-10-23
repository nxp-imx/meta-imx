require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9fc11dcd663bbe54eaaadbd727b31703"
SRC_URI[aarch64.sha256sum] = "30ba7926375dfa1e43f203148f1d1d51881174a3cb1de7a81b00c61130ad730c"
SRC_URI[arm.md5sum] = "cca29a21d1a6bb83eddb77eb8e369823"
SRC_URI[arm.sha256sum] = "183e989f16841fc26edb58f28a666cc33d860c6c102be3b615aae2e39696bee6"
