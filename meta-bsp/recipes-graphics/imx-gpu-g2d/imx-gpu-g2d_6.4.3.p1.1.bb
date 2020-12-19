require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "845a41bc22ecfa112ca79819a8c9f183"
SRC_URI[aarch64.sha256sum] = "1f12fc49b43faee45e5183272f53de3fd11137b851ab424f01e9197745d55e8d"
SRC_URI[arm.md5sum] = "bf64adb89dce149f7da2abe3abfb21d0"
SRC_URI[arm.sha256sum] = "caef03b63deaff6ec1212e5e46cbad39ae23cede63136ffc6e58b2079eeb3e33"
