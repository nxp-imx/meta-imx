require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "858f7aef185bfb9d40cdc347d841caba"
SRC_URI[aarch64.sha256sum] = "95cf8fb1d87bcdcd80c3aa08c12d6b65a77c5ca731912d50eb3db03b8cd8cbc0"
SRC_URI[arm.md5sum] = "3f14039dae9e13640c91201d2f337de2"
SRC_URI[arm.sha256sum] = "8e4e5141782b7ea3b7f7d1a499095376267e8f92129682d824687ccd758a76c6"
