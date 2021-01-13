require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "071d6f38f1e000def3f863def3a8affb"
SRC_URI[aarch64.sha256sum] = "919489face69d6abd6e9d5896ed46c851b1b052ca8292b9044ef002f21d17a68"
SRC_URI[arm.md5sum] = "88c384ae26d5e3ef61016d3e026b0206"
SRC_URI[arm.sha256sum] = "d9a817a18d76a734ff4ac8278fee6bc9e4d3d477531cd8e484f01aa60871238d"
