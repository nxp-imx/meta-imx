require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "72182350b7e4ac73064690d88d838442"
SRC_URI[aarch64.sha256sum] = "7649991e10cafb2f63774a8be7d4b632c460855c696254e2d6b35f82ce0f5c35"
SRC_URI[arm.md5sum] = "3ba4c33c24201e205d21875ed5f8f2e1"
SRC_URI[arm.sha256sum] = "cac018b58163b3a45a6556949bb245f3f43c424927f79489f98780c7709726a3"
