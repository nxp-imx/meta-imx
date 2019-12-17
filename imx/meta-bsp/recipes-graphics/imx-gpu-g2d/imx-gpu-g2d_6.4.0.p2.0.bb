require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d1aba327f16365e998dc0f40f24af351"
SRC_URI[aarch64.sha256sum] = "6e4716feeced9364e3ed715447daeb6db493352ac6bf2b82973915370107b5c3"
SRC_URI[arm.md5sum] = "c2abf9c36694ca79d2b3fe8dfabee362"
SRC_URI[arm.sha256sum] = "4013721ec6727acf40835c3790793ea3748629dd7c7084b0caed496f1bcdfd01"
