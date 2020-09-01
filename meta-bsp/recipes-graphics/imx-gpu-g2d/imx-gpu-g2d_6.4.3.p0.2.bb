require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f9204b330b2da4df581a7f8678ef8027"
SRC_URI[aarch64.sha256sum] = "d9951d1850be171226cdfae51fc3499b1b7ba89cd27c711356c1439ee9b677c9"
SRC_URI[arm.md5sum] = "5d654fcac5436cdbc34bf7a024c8712d"
SRC_URI[arm.sha256sum] = "1a9724fe859ac15a4ba322df32dfde8ea95b7a1a77b700c74e617723f38d1d28"
