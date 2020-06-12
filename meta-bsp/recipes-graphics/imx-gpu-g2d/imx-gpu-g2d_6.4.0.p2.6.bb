require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "fc369f12e14a291c06101aa6682e04b2"
SRC_URI[aarch64.sha256sum] = "b28fd43e2bab20100c4c6d812082f33e58396a328db247694e1d4a5f76ce5323"
SRC_URI[arm.md5sum] = "ec7e981f302922e7690e2dcfaf3ad9d3"
SRC_URI[arm.sha256sum] = "315e30e8e065482afbbb055f0dce8bc853bf5e17e7833b45eddee62711f4e5fa"
