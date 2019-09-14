require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ca0a8966e3859dc187cbfcf290e5b291"
SRC_URI[aarch64.sha256sum] = "cf79a4b94464ac75e8104b4d2d775de4d62a2a92f9199f8cf90babd2b727cca4"
SRC_URI[arm.md5sum] = "bdf2d90403823dabb6afa7bbac81f817"
SRC_URI[arm.sha256sum] = "110b1e9cd71bc67293c56862c17ecb40e1ee45b131ca53c39c9937d8d7bda8fc"
