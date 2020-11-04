require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ff37d9afece0c909e957ccbcbe0a8229"
SRC_URI[aarch64.sha256sum] = "001bf5d1d73ab05d562e06ca3075da17b66952bbb7539ceeec9ff9b9b374a3cb"
SRC_URI[arm.md5sum] = "6129fd425c3d6288f0c5ea5379689078"
SRC_URI[arm.sha256sum] = "3ab6c35330ed14fd9a796de3843eb615fbc7b7b84c6a19b21baeb8c7d8ba92a8"
