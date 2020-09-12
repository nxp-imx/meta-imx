require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "dbb32c4d7c16c33f9c0c4921db107dc4"
SRC_URI[aarch64.sha256sum] = "83969106e1658b12c92ba7650569c7a46dec96bd8394a02044725a55abd009fd"
SRC_URI[arm.md5sum] = "16f0f0047bb463672675302521d2ff18"
SRC_URI[arm.sha256sum] = "6b94573952aa0eedbda5099f0cce4df61f210094bf51f5fc8ad6b914939dd05c"
