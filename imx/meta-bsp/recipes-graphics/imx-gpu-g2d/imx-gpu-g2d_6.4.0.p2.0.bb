require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "63a650fac701b0e851e337b54e820f74"
SRC_URI[aarch64.sha256sum] = "6ba421ad285eee9c738d530de2126edda9153a4ec6dc5de0d5850801693e9356"
SRC_URI[arm.md5sum] = "9a76e8db68252ed8521c245808638a85"
SRC_URI[arm.sha256sum] = "d5af8968db5ac9b011dd7ac22c83943be97e25ab57ef0ed5ccd4a90d025f1a90"
