require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5864c325d8cc1e842598905f72b8013a"
SRC_URI[aarch64.sha256sum] = "bfee2f6fde15d11fdafb96926f6c10284a19d8505c4a10fa26ea77f4079a0d48"
SRC_URI[arm.md5sum] = "bba6f776fe7f306d7ebadf09ea4c7c75"
SRC_URI[arm.sha256sum] = "2dc2e944b126e7e0a3e78a8b2acd28f6eefb6698faef9e9e953a7eedf06e1681"
