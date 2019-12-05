require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "29216460608bd8468ac7217a4dada226"
SRC_URI[aarch64.sha256sum] = "49c80af440f77b796b1277768c1e84b0624c26a52686b82c6a16ff295d428e95"
SRC_URI[arm.md5sum] = "a42b245e9f1b02a789738596e34fbb03"
SRC_URI[arm.sha256sum] = "cffa8158b4f0f94c9dbc128133c3b6e6a580b08d07180ff79e5684006ea54b88"
