require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a3172359082ca4cb7d4570b080cabe6d"
SRC_URI[aarch64.sha256sum] = "ae681bdf649f3613e08d767c46e6d5d8e806cb0bee7af226ec67d74eb389c33d"
SRC_URI[arm.md5sum] = "595bfdfd7617f9f7dc04292687734a9b"
SRC_URI[arm.sha256sum] = "49fc889b684c612c1b5730a896b04673ddb6ebe7894bc4a00093b72a3985be56"
