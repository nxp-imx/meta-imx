require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "38d161708c42bb01362b7ba7f91bb6b4"
SRC_URI[aarch64.sha256sum] = "97ee90c81fa0db88e3249cb7df77f17f816ceb9a40355e03f72df99e600d7331"
SRC_URI[arm.md5sum] = "0011979d36205b1a3f03b404d6af4085"
SRC_URI[arm.sha256sum] = "725ad2edd41661713540d5e32509c754cda452acc608955689b8a64977b26ced"
