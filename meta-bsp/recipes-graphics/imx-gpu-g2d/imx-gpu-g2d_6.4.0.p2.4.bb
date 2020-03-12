require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b6c8e63235802a4dea1f5955088114c1"
SRC_URI[aarch64.sha256sum] = "2d65528bc9f51a69edca0c8fc0727e22875a9ff0b17dd5b17d5bc1ace2de0cc4"
SRC_URI[arm.md5sum] = "1297b0caa56b8d9f037884e881d6c734"
SRC_URI[arm.sha256sum] = "6ffda016a5dcb5db5d1001551759044c6b30af961cc6e7d500ba2b20df685a3a"
