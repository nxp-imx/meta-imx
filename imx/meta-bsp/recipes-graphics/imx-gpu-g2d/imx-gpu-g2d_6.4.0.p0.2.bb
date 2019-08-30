require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2bd257e33e91027291277f39993ecbbb"
SRC_URI[aarch64.sha256sum] = "1e308737fc9aacc0786020369d124ae6d9a55b60b6efc8dab8656d3ddc4947db"
SRC_URI[arm.md5sum] = "42fdcc1078bd0356f34aee6231c4d0a6"
SRC_URI[arm.sha256sum] = "265862908ae83cd092cb0831214c7046e4e3a8b6f1860895ee657a8ba4c8bd5c"
