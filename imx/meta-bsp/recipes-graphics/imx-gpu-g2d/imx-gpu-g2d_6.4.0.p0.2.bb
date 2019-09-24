require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "93b4d2c2a68caf8df894737c5b825e93"
SRC_URI[aarch64.sha256sum] = "4b263b1b51ebf853d87285b06d82ed27baa8d166ba7846748ac3cd712918da63"
SRC_URI[arm.md5sum] = "29e5784991e6f3fba3450f253b92b454"
SRC_URI[arm.sha256sum] = "eea4b421bfcdf6ff686293fcebfdc816f4a63287b4dd682d72de5d8d57337eb1"
