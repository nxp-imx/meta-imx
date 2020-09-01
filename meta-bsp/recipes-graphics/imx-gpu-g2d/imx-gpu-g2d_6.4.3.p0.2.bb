require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "81672e253eb7f0679e63dddfc429b7fb"
SRC_URI[aarch64.sha256sum] = "23dbce9b0e22140dc53d80b87e161fbcf2272f55352ff511dc98f8872c0707b7"
SRC_URI[arm.md5sum] = "5d654fcac5436cdbc34bf7a024c8712d"
SRC_URI[arm.sha256sum] = "1a9724fe859ac15a4ba322df32dfde8ea95b7a1a77b700c74e617723f38d1d28"
