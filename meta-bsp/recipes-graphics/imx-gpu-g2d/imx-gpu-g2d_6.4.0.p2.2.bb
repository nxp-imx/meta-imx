require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2094c076fa747b18bc0e694adb9396a7"
SRC_URI[aarch64.sha256sum] = "18ad5186856b516c8c4f904fbbb996361765ce9c2af5919a434d43f6e0865b2e"
SRC_URI[arm.md5sum] = "6e46d6ee62502f686250ca00450014ce"
SRC_URI[arm.sha256sum] = "24883b8dbff62c5b02f956aa22366c9d418164203550bb624f3d455d1ff4b13f"
