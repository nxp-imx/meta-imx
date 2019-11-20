require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "3b14535de11574e29b6a13753e29619b"
SRC_URI[aarch64.sha256sum] = "a07d50e6687e946ed3b68eddfc07885fa2b8e12cdcb8815feff0049cec571c98"
SRC_URI[arm.md5sum] = "0777122de3f89b85c88fd9a4e8d0cb1a"
SRC_URI[arm.sha256sum] = "e278bb65e27db7495b1b408737bd74c72f76abc786f3576d25a0c7fd84987e2d"
