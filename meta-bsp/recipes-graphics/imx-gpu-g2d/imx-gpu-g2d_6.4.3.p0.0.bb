require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "055d6fa26afa97ff4ebede62b6dbd8ff"
SRC_URI[aarch64.sha256sum] = "4c099ce0a27253cfcca691d4d8b3a2b41911fc4fbfaf3761c24d5958eb8391b9"
SRC_URI[arm.md5sum] = "6028f94e624a0f9d617fc9de231dd71b"
SRC_URI[arm.sha256sum] = "3f982115b1199849b8c5c58a9187366e94db3be956cb9cd36a664be50ef5b4ef"
