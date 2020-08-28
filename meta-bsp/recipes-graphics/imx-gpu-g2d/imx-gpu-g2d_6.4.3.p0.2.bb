require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "144abdc6b660ade6f455962a815264d7"
SRC_URI[aarch64.sha256sum] = "5464f59c137b30d305179e457acee1ab8eacd06dbbf7402a0f5b8898a9010e6d"
SRC_URI[arm.md5sum] = "b2e7cdea5693453eb0295ffd9587f4d2"
SRC_URI[arm.sha256sum] = "dfb86634811de88047d13bd27c7990f62cc0b7e8f01e9f718707005d10b39425"
