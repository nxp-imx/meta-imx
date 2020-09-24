require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ecaf0628eafe8149d1ae5b7a3da51e24"
SRC_URI[aarch64.sha256sum] = "99b8a300e9633d77236fba355da27419e742bff3cd434b5adadc1f0675c37f05"
SRC_URI[arm.md5sum] = "595bfdfd7617f9f7dc04292687734a9b"
SRC_URI[arm.sha256sum] = "49fc889b684c612c1b5730a896b04673ddb6ebe7894bc4a00093b72a3985be56"
