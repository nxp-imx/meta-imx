require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "297a1a26ea7fc66886933fd9055bd7a4"
SRC_URI[aarch64.sha256sum] = "0d7cf5e051e9c29f0f2f8cbe0e0dabb61a68c4fba198f2c18804cdcd1e791b8c"
SRC_URI[arm.md5sum] = "7c2f95020af36ba8dfa844e2334fbfae"
SRC_URI[arm.sha256sum] = "266022ff242e25b91313ed118c0505b67fefbc36e3eb3548c614c3fb6542684d"
