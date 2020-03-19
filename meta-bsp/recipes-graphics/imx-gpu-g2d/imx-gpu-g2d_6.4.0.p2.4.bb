require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "3d12d3880b829fcf7ca1a649fe9304ec"
SRC_URI[aarch64.sha256sum] = "1fe4e67af277d9d0f39591d4c24dc45851fe36a0f1ab6d9aeafbe42d38b6c31f"
SRC_URI[arm.md5sum] = "b10eda5e6aca386ae4f49284ecb99b53"
SRC_URI[arm.sha256sum] = "55f985639e027548dc65a55473a6299d8569f8e06eb69c233cc54da0e48cb52d"
