require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=e9e880185bda059c90c541d40ceca922" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "bfa0430912714e920d2f9f737233783a"
SRC_URI[aarch64.sha256sum] = "6233f6cbaa5ec7015c7cee4fa2453c5b233a6a0ebacb6dadffae392cf72845d5"
SRC_URI[arm.md5sum] = "e7ccfb2e82d4953c2d844db221e74906"
SRC_URI[arm.sha256sum] = "37acb635849ffdbb88b2a1df3bc047fcd453ce25931de03a4afabdaeb6ed3ebf"
