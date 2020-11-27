require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "43769400a87eaf86c0097e9d005466c0"
SRC_URI[aarch64.sha256sum] = "8a28b1c57a153d56537951defddfa475c2aa4cc9b4d5ff098d0093d0bb4c7c72"
SRC_URI[arm.md5sum] = "2bdb65f38867b0b6ece575fd43959cce"
SRC_URI[arm.sha256sum] = "59e6a95700f7f184d043bed14cb931d8ebed0089a78c698c43f72383843992c9"
