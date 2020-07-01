require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f17fa0b3b650080987d61d98a5555acc"
SRC_URI[aarch64.sha256sum] = "88a355700a9496773f8e826d7e1dbdd031b5b8df6403780cb10ae51a81a7c652"
SRC_URI[arm.md5sum] = "bf89b9bb1fec80f6796cc1e2f27f0ff4"
SRC_URI[arm.sha256sum] = "3883c8d46c39d23eb88a46830272f3f39bd11abbb145bf9ca09762739e45e5ab"
