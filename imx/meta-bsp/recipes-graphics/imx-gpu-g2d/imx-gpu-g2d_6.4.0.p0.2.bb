require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b7051effdd5b6351ab9ea0446a1625a2"
SRC_URI[aarch64.sha256sum] = "a79ec680f5970785d97dcc36bcc28eaf829b64962c8318d5c39f26fb2930f866"
SRC_URI[arm.md5sum] = "3b6a4c49d093d7fba8f45d2128963601"
SRC_URI[arm.sha256sum] = "a0bf03806597b79e7485eb65723f24b6762ac3a6f53be7a9da659e6dd2aabb9d"
