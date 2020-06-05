require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "155102c5f698fb2aeaf6f17f406fa8cb"
SRC_URI[aarch64.sha256sum] = "d3116b59f3d9e5781af195712a86f266523c12cc47a3436ca45be0d3e12dc81a"
SRC_URI[arm.md5sum] = "2b4630ad58cf80545cf07fa6294b8b39"
SRC_URI[arm.sha256sum] = "7a4ce2bbb8b1f64ca691dd47205de6ecfa5368f43f166fb2393d2cc0eea90d76"
