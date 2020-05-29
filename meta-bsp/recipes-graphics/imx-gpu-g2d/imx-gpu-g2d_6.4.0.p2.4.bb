require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "88f98e03f3f85c9a768ea5e4ff7475fa"
SRC_URI[aarch64.sha256sum] = "553bbe9ee1caa222fd14b835deb2afedf9ed936b7a13424328df75892286f666"
SRC_URI[arm.md5sum] = "3b12892309d166554c697a87e8084b16"
SRC_URI[arm.sha256sum] = "010bab5780476f26406e16b058514453dc235a0e7f4b995fa03c976d06e5cb96"
