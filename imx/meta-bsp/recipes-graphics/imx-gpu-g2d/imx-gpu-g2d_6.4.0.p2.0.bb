require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "69fe3f918f9ec594633236a39a639db9"
SRC_URI[aarch64.sha256sum] = "0ace5d5c1c848291e070431c30fc321817f74ffe8e34d017e5db5ec8c72fd5b6"
SRC_URI[arm.md5sum] = "ae00a85047dfa022eb9f742176cea735"
SRC_URI[arm.sha256sum] = "60e408ed0b84d4479aa0dfcb305641ba4b6881f888178839e9038784c73a36ae"
