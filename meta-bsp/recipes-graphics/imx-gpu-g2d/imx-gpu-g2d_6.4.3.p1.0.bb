require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "40e45f8f9e23033a8fcdf586a9d51e96"
SRC_URI[aarch64.sha256sum] = "b6c1400f1caee87856b5ccb97ded13ed1e28e7e9ebdb016a1a0301004f2ff9e8"
SRC_URI[arm.md5sum] = "8429a31b7854d745aebeb78e2473bf49"
SRC_URI[arm.sha256sum] = "8dd287124e490931156d0b5ee6f902c3d04d6858425f86a118d2c80f5981bdf7"
