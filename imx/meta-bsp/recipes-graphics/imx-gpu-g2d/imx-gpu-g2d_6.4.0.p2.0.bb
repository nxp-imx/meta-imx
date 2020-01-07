require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "53bfdf1b0221a00a7592fbf4148652f9"
SRC_URI[aarch64.sha256sum] = "25716dcd25cd39d25a1c94ce1905dc9af5fe6c393656a002f194ecc97edf98c8"
SRC_URI[arm.md5sum] = "5bd08ffdcecdfec52c192b02181dc26e"
SRC_URI[arm.sha256sum] = "75e708c456e51cf2a264ec6836735d809462fb2593f2885e2e922ac455383d22"
