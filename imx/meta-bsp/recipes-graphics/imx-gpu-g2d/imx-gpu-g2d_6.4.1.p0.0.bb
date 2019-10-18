require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "4c06b51e5bc49054a6ffeefb9ce1a875"
SRC_URI[aarch64.sha256sum] = "820066c381c761893d7e09220cbbb3914502161e8b5c651b2223fe33ec76f2c6"
SRC_URI[arm.md5sum] = "9a9c4abdf84298527484408b8609edbc"
SRC_URI[arm.sha256sum] = "42f0e84a07c90432024e62640228c0c732af0fafb2c6187bc9cd4328d8606e37"
