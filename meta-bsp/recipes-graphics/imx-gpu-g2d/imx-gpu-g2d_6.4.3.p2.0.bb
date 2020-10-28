require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "50919c15994cec935d8154c68c0272af"
SRC_URI[aarch64.sha256sum] = "5a1e312fa11bd01e6d8da966884250ebabecae94da01e8073bc310830855c591"
SRC_URI[arm.md5sum] = "10af0fa3bc31de44318df9f2de47f69f"
SRC_URI[arm.sha256sum] = "271a1e8855b0ca5e003a4dc8585052c7e578436b9367e04b48e3872dee7c6c2d"
