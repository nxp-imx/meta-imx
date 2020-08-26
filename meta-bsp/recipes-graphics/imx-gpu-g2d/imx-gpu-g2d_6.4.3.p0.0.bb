require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "dc7ed46c07573c3223ec748c09b73c41"
SRC_URI[aarch64.sha256sum] = "c7f7fc55b40f6a182b10ae5e0900fb0a5e6c9d99338f50521e18562031ef8dac"
SRC_URI[arm.md5sum] = "95a4bed904ca563eb499e754333d3d46"
SRC_URI[arm.sha256sum] = "ee825cc4c01f9dbdc56132027d3415035469e9a522cd21e7fdf891c6eff7f5e7"
