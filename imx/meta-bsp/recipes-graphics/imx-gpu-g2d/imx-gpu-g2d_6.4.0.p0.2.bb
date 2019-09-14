require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b2b86933479552ce0d0b491821049913"
SRC_URI[aarch64.sha256sum] = "0a80b4131b35597d0941fc6d16202a64f3c7b30e7ef7230f59f3bbd9f730bd58"
SRC_URI[arm.md5sum] = "bdf2d90403823dabb6afa7bbac81f817"
SRC_URI[arm.sha256sum] = "110b1e9cd71bc67293c56862c17ecb40e1ee45b131ca53c39c9937d8d7bda8fc"
