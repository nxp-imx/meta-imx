require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ca0a8966e3859dc187cbfcf290e5b291"
SRC_URI[aarch64.sha256sum] = "cf79a4b94464ac75e8104b4d2d775de4d62a2a92f9199f8cf90babd2b727cca4"
SRC_URI[arm.md5sum] = "34533ab617ad60505db7d5bcd469b78d"
SRC_URI[arm.sha256sum] = "48acec8d6ed3a289f3c05647b976371f76781a18afd43e75f95384c559e8530a"
