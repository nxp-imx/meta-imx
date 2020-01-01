require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9b8b16e18ae3f5f84c293c6b1a4c43b3"
SRC_URI[aarch64.sha256sum] = "da0a003a2e0cd1dcc923fd4a10150fa7d080eb52697262c10afadcc2dc46d17a"
SRC_URI[arm.md5sum] = "99c0a8da44f37a4cd008e49617a3f662"
SRC_URI[arm.sha256sum] = "f2f6ce1a5198e7780cdc769b17580cc476fce8c61638bd2f1e0ba68aed6b0cec"
