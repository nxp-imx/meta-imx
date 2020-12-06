require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "128dcbd58b9cae64c06109e951c2c041"
SRC_URI[aarch64.sha256sum] = "8d46ad4f4870e17026f35ccb82035a41ae7afa1b4ec55155be700c3f588570fd"
SRC_URI[arm.md5sum] = "36fc174d9847450de643209aae68194d"
SRC_URI[arm.sha256sum] = "b9986be92368b0c9701f26286594d3735511d53dd5231bd32355af7e22cefcf6"
