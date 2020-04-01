require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e22b17a0c84a5325871b370a16137917"
SRC_URI[aarch64.sha256sum] = "3c2ae046e0f37e18350c4dc695fe3cbbeb58c2faa244767bf8209ea511b6d088"
SRC_URI[arm.md5sum] = "7be9da5b28bffbc733bd2171e947fac6"
SRC_URI[arm.sha256sum] = "1885afa388a7d0b15ccbcb3fe197bcfaa7e851b673e30035b4ecc5eefab547ac"
