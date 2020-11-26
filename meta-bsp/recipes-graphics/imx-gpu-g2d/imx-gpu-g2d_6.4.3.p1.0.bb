require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "86b9ab323231a8816f8432c726ee0658"
SRC_URI[aarch64.sha256sum] = "12340933d845cf292b8cb51f49e7bae4112387dd60ec65afe07a4975957be52c"
SRC_URI[arm.md5sum] = "ad25363e0c65cdda81a6105a6a86abe8"
SRC_URI[arm.sha256sum] = "2f709ec5db88a3dca812f1f592406402383d6c57b091d7df02972c8ff96e19f2"
