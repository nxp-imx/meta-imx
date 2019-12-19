require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "972d5a2fc422810a04f8052426f01430"
SRC_URI[aarch64.sha256sum] = "10bb369bf1d521756bb723923a62861e9af70467e17b09b687ef0a3d1fcc7bc0"
SRC_URI[arm.md5sum] = "5b3d20a757fe3f0c183c7b06a6be0fbd"
SRC_URI[arm.sha256sum] = "32be5ee5e1044b182e72f1a715d7e9aae60d04b16062b667d5c9e030ca08354b"
