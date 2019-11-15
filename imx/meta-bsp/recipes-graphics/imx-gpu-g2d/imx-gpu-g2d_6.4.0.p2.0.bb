require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "3b14535de11574e29b6a13753e29619b"
SRC_URI[aarch64.sha256sum] = "a07d50e6687e946ed3b68eddfc07885fa2b8e12cdcb8815feff0049cec571c98"
SRC_URI[arm.md5sum] = "95650a0f55517c7d29b74943d750b558"
SRC_URI[arm.sha256sum] = "15c9d5c5bca2bede60c3100975cca5d94f8256f7e78aa9bbc309b50e59e4e215"
