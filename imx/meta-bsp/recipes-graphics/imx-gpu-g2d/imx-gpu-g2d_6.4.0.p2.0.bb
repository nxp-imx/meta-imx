require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "31256acce9b9272e3d0b951acf473562"
SRC_URI[aarch64.sha256sum] = "02dba5dbb51dfdab313ec87fc409740d3afee522f03b7b5babd882812ac53c0a"
SRC_URI[arm.md5sum] = "5b3d20a757fe3f0c183c7b06a6be0fbd"
SRC_URI[arm.sha256sum] = "32be5ee5e1044b182e72f1a715d7e9aae60d04b16062b667d5c9e030ca08354b"
