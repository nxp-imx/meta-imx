require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b7051effdd5b6351ab9ea0446a1625a2"
SRC_URI[aarch64.sha256sum] = "a79ec680f5970785d97dcc36bcc28eaf829b64962c8318d5c39f26fb2930f866"
SRC_URI[arm.md5sum] = "0a4194a3b2e7bc7bd0e3f716012157c0"
SRC_URI[arm.sha256sum] = "846b674aeecb6a8885ac1b90d4a6489c346b5c085e75c264052fd9f77baf77a7"
