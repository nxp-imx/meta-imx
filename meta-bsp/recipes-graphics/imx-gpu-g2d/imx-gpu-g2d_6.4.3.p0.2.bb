require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "81672e253eb7f0679e63dddfc429b7fb"
SRC_URI[aarch64.sha256sum] = "23dbce9b0e22140dc53d80b87e161fbcf2272f55352ff511dc98f8872c0707b7"
SRC_URI[arm.md5sum] = "b2e7cdea5693453eb0295ffd9587f4d2"
SRC_URI[arm.sha256sum] = "dfb86634811de88047d13bd27c7990f62cc0b7e8f01e9f718707005d10b39425"
