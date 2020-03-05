require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8214173ba6448eabf28f5fe425652ac1"
SRC_URI[aarch64.sha256sum] = "005f73974f0317c01347663419ded4e13fc4683f2251ac1cda4b8f0255005303"
SRC_URI[arm.md5sum] = "6e46d6ee62502f686250ca00450014ce"
SRC_URI[arm.sha256sum] = "24883b8dbff62c5b02f956aa22366c9d418164203550bb624f3d455d1ff4b13f"
