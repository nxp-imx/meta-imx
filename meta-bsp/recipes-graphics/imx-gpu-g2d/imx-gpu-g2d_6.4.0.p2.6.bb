require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f17fa0b3b650080987d61d98a5555acc"
SRC_URI[aarch64.sha256sum] = "88a355700a9496773f8e826d7e1dbdd031b5b8df6403780cb10ae51a81a7c652"
SRC_URI[arm.md5sum] = "e495064ac72daa37bac0135bbe8645f5"
SRC_URI[arm.sha256sum] = "36ce5fc26e50acb3e8cc1ad348af314cb0bd56d5d8c4341b498ab9f669a84bd3"
