require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=e9e880185bda059c90c541d40ceca922" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "df816a614dce2119293d9e052c716066"
SRC_URI[aarch64.sha256sum] = "70000ec743ee04bdf40d3ab6b84634c5065644360fa981da2ab751af2f9696c5"
SRC_URI[arm.md5sum] = "becdd8508d4e0864c604ebfbf6590083"
SRC_URI[arm.sha256sum] = "c75b7202284e65f0e39e4bfd900b047ae99b8cbeba754d69abc06699161fdb26"
