require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9442a902e3cf708a733a570da5ccfb5e"
SRC_URI[aarch64.sha256sum] = "27f4809a9e512dd266afcb1cb05187bfc2787b950892129198bef6ba551de849"
SRC_URI[arm.md5sum] = "16f0f0047bb463672675302521d2ff18"
SRC_URI[arm.sha256sum] = "6b94573952aa0eedbda5099f0cce4df61f210094bf51f5fc8ad6b914939dd05c"
