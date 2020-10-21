require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=e9e880185bda059c90c541d40ceca922" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "df816a614dce2119293d9e052c716066"
SRC_URI[aarch64.sha256sum] = "70000ec743ee04bdf40d3ab6b84634c5065644360fa981da2ab751af2f9696c5"
SRC_URI[arm.md5sum] = "88873ee5fd7f08f6a715901fc9e745a0"
SRC_URI[arm.sha256sum] = "8ce069789cbe35f803b77379780eda88d9e5f46dca5f6a656d455afe211d4db7"
