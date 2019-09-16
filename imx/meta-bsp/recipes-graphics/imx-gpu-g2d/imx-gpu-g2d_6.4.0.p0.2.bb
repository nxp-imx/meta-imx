require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b2b86933479552ce0d0b491821049913"
SRC_URI[aarch64.sha256sum] = "0a80b4131b35597d0941fc6d16202a64f3c7b30e7ef7230f59f3bbd9f730bd58"
SRC_URI[arm.md5sum] = "ae385ef1f7858f8607b5dce1fa19f499"
SRC_URI[arm.sha256sum] = "646f887c2c9abac15a965199dac86c91dc925d093c2cfae56be31a36f55d5668"
