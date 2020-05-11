require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "09904547e0fa9dc419e7c2d91b197118"
SRC_URI[aarch64.sha256sum] = "08d824c26534f335191051a61a0f41eac960c936ec7952dd19529dfb82af4ac3"
SRC_URI[arm.md5sum] = "a20e194daf56573354784ae1e8e3ca3b"
SRC_URI[arm.sha256sum] = "010e136d38b1d17cd2587a6d7b1f5897b106db867fd9251d5e2763ebe9d6c8d5"
