require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7e2a5604f566fe05401f88ff189ee39d"
SRC_URI[aarch64.sha256sum] = "ade9e0e25188ee2bce88b6b78cb708d17b3e186ca4576ad749cb48209216e4ee"
SRC_URI[arm.md5sum] = "6129fd425c3d6288f0c5ea5379689078"
SRC_URI[arm.sha256sum] = "3ab6c35330ed14fd9a796de3843eb615fbc7b7b84c6a19b21baeb8c7d8ba92a8"
