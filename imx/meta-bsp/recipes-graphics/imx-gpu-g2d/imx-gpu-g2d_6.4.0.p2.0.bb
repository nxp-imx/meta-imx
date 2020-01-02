require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9b8b16e18ae3f5f84c293c6b1a4c43b3"
SRC_URI[aarch64.sha256sum] = "da0a003a2e0cd1dcc923fd4a10150fa7d080eb52697262c10afadcc2dc46d17a"
SRC_URI[arm.md5sum] = "e471881ab927eef15ba59c0920844c70"
SRC_URI[arm.sha256sum] = "03d6b18bc15bb2fbaf4c41d0c096b626fd1f057ccfcb5abd1d156e17c065f08f"
