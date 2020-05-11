require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "87b39f6c5e58b7d090cbdad83decf31d"
SRC_URI[aarch64.sha256sum] = "b9702492c5b5b78793ac47e1f918c9d0e846fa85afaff99bb1a2bfa018e56349"
SRC_URI[arm.md5sum] = "84c6fb07e9dcc91243af3fc7eb79f90b"
SRC_URI[arm.sha256sum] = "606ca23e4c7cc3e4bcd5218ce50539b940654c4ac1cb9b4d3f6e579e0834c7b1"
