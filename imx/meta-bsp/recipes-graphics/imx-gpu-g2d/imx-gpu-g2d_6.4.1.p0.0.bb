require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7ee04df96febb0f180531ab53c6e1955"
SRC_URI[aarch64.sha256sum] = "f806c42a95218722709cf6282b2c3af509aeeeaae85429e80650e64084ad8a0e"
SRC_URI[arm.md5sum] = "cca29a21d1a6bb83eddb77eb8e369823"
SRC_URI[arm.sha256sum] = "183e989f16841fc26edb58f28a666cc33d860c6c102be3b615aae2e39696bee6"
