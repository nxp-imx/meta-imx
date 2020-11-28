require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "69b1a2798419fde10908952e19b6f0ff"
SRC_URI[aarch64.sha256sum] = "bb87b360040a4ff29ece226ed37d867f23ef2eaf2ff5ef9302d782c7b76bb049"
SRC_URI[arm.md5sum] = "dfd1f19c0fb6eca41bd9d1f1a8132ba9"
SRC_URI[arm.sha256sum] = "a676274014525074b0cbbc31232ed9c7dd5399a69c4e77bdcc92f5b98f48a1bf"
