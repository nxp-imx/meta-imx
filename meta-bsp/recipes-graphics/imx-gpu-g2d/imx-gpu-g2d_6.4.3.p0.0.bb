require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a32b1034a8ccdfd470014212b60ba114"
SRC_URI[aarch64.sha256sum] = "9b77f2157532bf2a41e92fd2c3865c87c6cc9a9f0d6c760525f605d8f9eb590d"
SRC_URI[arm.md5sum] = "6028f94e624a0f9d617fc9de231dd71b"
SRC_URI[arm.sha256sum] = "3f982115b1199849b8c5c58a9187366e94db3be956cb9cd36a664be50ef5b4ef"
