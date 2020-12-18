require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "35f306412aa836f4c01a727f428f382a"
SRC_URI[aarch64.sha256sum] = "01a058202cfdf6e0a110cbbdef135e097e16cd37473a678791c5836400654ba2"
SRC_URI[arm.md5sum] = "89f590ebcdcb9cf9099c9e07914d8295"
SRC_URI[arm.sha256sum] = "adac78e5210ced358d3c638d8a99a8f7a936d36ce0adc4fd786dc35296da1c48"
