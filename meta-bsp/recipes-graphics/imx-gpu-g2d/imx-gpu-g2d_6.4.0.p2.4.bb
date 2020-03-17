require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "c3a24065a51f86f8148946d6015e0356"
SRC_URI[aarch64.sha256sum] = "c7f36dcc5e05b9d80cbd5308b34564f91405dd82415eff9c8fe6266dd5b5d187"
SRC_URI[arm.md5sum] = "2f764e9f6998acf0de286977d7c9ab08"
SRC_URI[arm.sha256sum] = "8c173d4d3266857f9d408a6c0f7fd9f0e6d466173703cb199a8d7625a68047ae"
