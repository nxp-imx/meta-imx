require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "297a1a26ea7fc66886933fd9055bd7a4"
SRC_URI[aarch64.sha256sum] = "0d7cf5e051e9c29f0f2f8cbe0e0dabb61a68c4fba198f2c18804cdcd1e791b8c"
SRC_URI[arm.md5sum] = "d99004a6380f51c1c6ab94cea123fdcd"
SRC_URI[arm.sha256sum] = "8c68644bb1e15a7098f69be0e1e826d44eb211fe28cb6bf71d7192a28adbe1d9"
