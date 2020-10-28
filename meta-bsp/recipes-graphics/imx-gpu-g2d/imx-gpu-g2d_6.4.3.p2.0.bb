require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "503c5e26b1e02d65406b36dd0071df1c"
SRC_URI[aarch64.sha256sum] = "98bfca5ee78d651ccb9292d9f3e875d6f76b9d213500913c024677cf94f0eef4"
SRC_URI[arm.md5sum] = "10af0fa3bc31de44318df9f2de47f69f"
SRC_URI[arm.sha256sum] = "271a1e8855b0ca5e003a4dc8585052c7e578436b9367e04b48e3872dee7c6c2d"
