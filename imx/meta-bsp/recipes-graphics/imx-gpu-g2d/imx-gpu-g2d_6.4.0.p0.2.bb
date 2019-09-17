require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "20ac4d184befa5cbf8f28983d8deeedf"
SRC_URI[aarch64.sha256sum] = "e2f9611a0e0da7d916ed1ccd92205b67ac74ec96b1155dbc777633fc7c8518a0"
SRC_URI[arm.md5sum] = "62171422cad09ce93640633dd952c75e"
SRC_URI[arm.sha256sum] = "a469f35e3121aa6583b767eaf0a48fad93943845c6c0daf0b69332d7f97ebbf3"
