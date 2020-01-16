require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8b2170e9029821d901b1ffbcadea66b8"
SRC_URI[aarch64.sha256sum] = "f6f35a694bab0d4d1699d717e3bec6a06e1620d8ce2ac5e71c60e9c37df2874e"
SRC_URI[arm.md5sum] = "c0621a2ffa0b0ec5518158f2d6c44ccc"
SRC_URI[arm.sha256sum] = "a0ccc8f48a5fe8c97cab702ac539a6c92d28e7da85da49c749b58c97be499194"
