require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f9204b330b2da4df581a7f8678ef8027"
SRC_URI[aarch64.sha256sum] = "d9951d1850be171226cdfae51fc3499b1b7ba89cd27c711356c1439ee9b677c9"
SRC_URI[arm.md5sum] = "d4d31ae5c6abc297c789c9ad86d981d9"
SRC_URI[arm.sha256sum] = "c362803e80306c2a522c5ea52f964066f9e565ca0964f6d63e1d9ae6f9907b3e"
