require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "efd2e567532062d33d9c996b2ab8c498"
SRC_URI[aarch64.sha256sum] = "d57aa207e8679be5559dec21649edffd6c35dee2a869e51a8bc66c0c2acecfcf"
SRC_URI[arm.md5sum] = "84c6fb07e9dcc91243af3fc7eb79f90b"
SRC_URI[arm.sha256sum] = "606ca23e4c7cc3e4bcd5218ce50539b940654c4ac1cb9b4d3f6e579e0834c7b1"
