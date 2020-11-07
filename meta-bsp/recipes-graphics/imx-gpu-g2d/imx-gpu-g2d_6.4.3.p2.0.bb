require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5d8d1b094fa1744f6837d53f6445a124"
SRC_URI[aarch64.sha256sum] = "69f375bb68caa6bca4c9a9097f1619afbb0117ecc29d322a12c88f3ca40d1a67"
SRC_URI[arm.md5sum] = "7c2f95020af36ba8dfa844e2334fbfae"
SRC_URI[arm.sha256sum] = "266022ff242e25b91313ed118c0505b67fefbc36e3eb3548c614c3fb6542684d"
