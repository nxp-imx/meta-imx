require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "c3a24065a51f86f8148946d6015e0356"
SRC_URI[aarch64.sha256sum] = "c7f36dcc5e05b9d80cbd5308b34564f91405dd82415eff9c8fe6266dd5b5d187"
SRC_URI[arm.md5sum] = "b10eda5e6aca386ae4f49284ecb99b53"
SRC_URI[arm.sha256sum] = "55f985639e027548dc65a55473a6299d8569f8e06eb69c233cc54da0e48cb52d"
