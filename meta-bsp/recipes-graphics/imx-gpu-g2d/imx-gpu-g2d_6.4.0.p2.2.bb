require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "bafd6230649c59be42d236abf6db664e"
SRC_URI[aarch64.sha256sum] = "c6b26db668d66fca50a09d14e7bca8f3dbc3abf6ba74d6d2d1e11132ac509177"
SRC_URI[arm.md5sum] = "11ad2b5ef59e3aea92c6cabc4848bdaf"
SRC_URI[arm.sha256sum] = "b00b69345f74382077411a57c8b5ea5134484efe876730ee026a5adf2b96834e"
