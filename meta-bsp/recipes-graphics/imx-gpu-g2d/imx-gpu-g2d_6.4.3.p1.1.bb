require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8d572ce30ee8291c21a7aae7a5c2b93e"
SRC_URI[aarch64.sha256sum] = "c8963154b76d01618f0b656196dc1d1d8a510924017ed572f41d4ee650c28d14"
SRC_URI[arm.md5sum] = "f94de4871d5b9002514c2495019659ee"
SRC_URI[arm.sha256sum] = "e6c75f5eeaf61e6d7033bd4b9c985fd61dda07d9dbe0163c91fdb020b0dfbfb7"
