require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2a37e2784422eb68dd901b78685be2eb"
SRC_URI[aarch64.sha256sum] = "57e7964b6e70db9845033cc891cfe8d9492009a4f6dbadccc660cede50b8780d"
SRC_URI[arm.md5sum] = "95a4bed904ca563eb499e754333d3d46"
SRC_URI[arm.sha256sum] = "ee825cc4c01f9dbdc56132027d3415035469e9a522cd21e7fdf891c6eff7f5e7"
