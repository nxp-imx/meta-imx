require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ecaf0628eafe8149d1ae5b7a3da51e24"
SRC_URI[aarch64.sha256sum] = "99b8a300e9633d77236fba355da27419e742bff3cd434b5adadc1f0675c37f05"
SRC_URI[arm.md5sum] = "10fa304e45b8567929bde288a6266b09"
SRC_URI[arm.sha256sum] = "1e2c42b3174bcee8968a32ecca030bef74a794182ec3abe2bd4b01688b7c7fb8"
