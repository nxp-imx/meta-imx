require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "efd2e567532062d33d9c996b2ab8c498"
SRC_URI[aarch64.sha256sum] = "d57aa207e8679be5559dec21649edffd6c35dee2a869e51a8bc66c0c2acecfcf"
SRC_URI[arm.md5sum] = "a20e194daf56573354784ae1e8e3ca3b"
SRC_URI[arm.sha256sum] = "010e136d38b1d17cd2587a6d7b1f5897b106db867fd9251d5e2763ebe9d6c8d5"
