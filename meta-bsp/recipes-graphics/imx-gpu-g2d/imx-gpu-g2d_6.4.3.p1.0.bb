require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=e9e880185bda059c90c541d40ceca922" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d3d61c6a6cdbc230df0fadde77783cb1"
SRC_URI[aarch64.sha256sum] = "647df4970c566f61b508724622a1d22e894cb927a77cc0ec43372aacaeb7c96c"
SRC_URI[arm.md5sum] = "88873ee5fd7f08f6a715901fc9e745a0"
SRC_URI[arm.sha256sum] = "8ce069789cbe35f803b77379780eda88d9e5f46dca5f6a656d455afe211d4db7"
