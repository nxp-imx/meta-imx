require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "bafd6230649c59be42d236abf6db664e"
SRC_URI[aarch64.sha256sum] = "c6b26db668d66fca50a09d14e7bca8f3dbc3abf6ba74d6d2d1e11132ac509177"
SRC_URI[arm.md5sum] = "df593d1f7f9888d1f32db72272f2f056"
SRC_URI[arm.sha256sum] = "b32517f096576836a737db32998b0355ab95c506ac30e8413f8db63b8bdd43d4"
