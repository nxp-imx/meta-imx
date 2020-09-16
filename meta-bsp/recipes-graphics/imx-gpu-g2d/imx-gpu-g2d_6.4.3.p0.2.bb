require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "26a5bf2bbd91015aed5258926f5446a8"
SRC_URI[aarch64.sha256sum] = "55ae4111b1c4a4355b6d7653be0a59b15adeae2f9094decafc10b2e2ab0d4d88"
SRC_URI[arm.md5sum] = "df012a125c5f2827a85b8dfde72df82d"
SRC_URI[arm.sha256sum] = "07740b98f8bd363b9584932aa5393199160e6103d8ea22f78418c5358462dea6"
