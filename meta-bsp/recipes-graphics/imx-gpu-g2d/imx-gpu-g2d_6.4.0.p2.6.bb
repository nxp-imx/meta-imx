require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f17fa0b3b650080987d61d98a5555acc"
SRC_URI[aarch64.sha256sum] = "88a355700a9496773f8e826d7e1dbdd031b5b8df6403780cb10ae51a81a7c652"
SRC_URI[arm.md5sum] = "288d4c1045d90dd239cd35cc6650e82a"
SRC_URI[arm.sha256sum] = "964886e4cdce595d8447fd29e2d1160029489eecdb4e464cbaf77924c02e8bdd"
