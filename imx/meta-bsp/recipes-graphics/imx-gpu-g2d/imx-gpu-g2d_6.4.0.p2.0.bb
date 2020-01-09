require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "80ebde4eceb9a868559a3402ea9f7196"
SRC_URI[aarch64.sha256sum] = "e3ba222108989a0085ff1d9a5440a009ea4296956907e08f5bdd8fa33b78ac1d"
SRC_URI[arm.md5sum] = "ae00a85047dfa022eb9f742176cea735"
SRC_URI[arm.sha256sum] = "60e408ed0b84d4479aa0dfcb305641ba4b6881f888178839e9038784c73a36ae"
