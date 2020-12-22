require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "845a41bc22ecfa112ca79819a8c9f183"
SRC_URI[aarch64.sha256sum] = "1f12fc49b43faee45e5183272f53de3fd11137b851ab424f01e9197745d55e8d"
SRC_URI[arm.md5sum] = "a66342eaef3ffacea38206bb526e383f"
SRC_URI[arm.sha256sum] = "749e9002bbf1856bd3a954d6619375e4b76f6c5d8e13ae0f2f2fd4a12f0dea7a"
