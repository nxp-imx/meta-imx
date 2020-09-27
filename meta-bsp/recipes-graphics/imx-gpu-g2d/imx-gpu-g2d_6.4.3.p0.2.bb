require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "34199ddbc22e990abf279977216465f9"
SRC_URI[aarch64.sha256sum] = "63f2a1d694851e88467c1890f7d7652b570797526ce186bb1ef3ac99f19fa42d"
SRC_URI[arm.md5sum] = "10fa304e45b8567929bde288a6266b09"
SRC_URI[arm.sha256sum] = "1e2c42b3174bcee8968a32ecca030bef74a794182ec3abe2bd4b01688b7c7fb8"
