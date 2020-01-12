require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "176766ec23af55ea99ab61cbc8d20b6e"
SRC_URI[aarch64.sha256sum] = "3994c507c942211a49241949d0bcc351740a9fdb4729fd3ae515f733183f0be4"
SRC_URI[arm.md5sum] = "c0621a2ffa0b0ec5518158f2d6c44ccc"
SRC_URI[arm.sha256sum] = "a0ccc8f48a5fe8c97cab702ac539a6c92d28e7da85da49c749b58c97be499194"
