require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "155f580bc9747d2d27323b093a3724a6"
SRC_URI[aarch64.sha256sum] = "d6c1ddf1e747cecd53a5477f4de9775cca0ec625c5b15a708cc400ca6f7e7a95"
SRC_URI[arm.md5sum] = "6e46d6ee62502f686250ca00450014ce"
SRC_URI[arm.sha256sum] = "24883b8dbff62c5b02f956aa22366c9d418164203550bb624f3d455d1ff4b13f"
