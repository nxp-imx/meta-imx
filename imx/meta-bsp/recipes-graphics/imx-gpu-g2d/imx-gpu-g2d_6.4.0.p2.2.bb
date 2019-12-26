require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a07305d0dd7a79e373793deb13585fab"
SRC_URI[aarch64.sha256sum] = "6c17d2d560c639ddf7c894a4b125b38719fc0d1454f634ca8361fdfea26e82cc"
SRC_URI[arm.md5sum] = "cc7e7ff7810f48e8eae10d63bac3e04f"
SRC_URI[arm.sha256sum] = "8ac798b12410b8fb0a4a3d2d793f1c11091bb5650f6b49be720c7bf2558baa3c"
