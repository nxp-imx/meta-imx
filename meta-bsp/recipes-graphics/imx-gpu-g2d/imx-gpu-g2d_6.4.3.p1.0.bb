require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "86b9ab323231a8816f8432c726ee0658"
SRC_URI[aarch64.sha256sum] = "12340933d845cf292b8cb51f49e7bae4112387dd60ec65afe07a4975957be52c"
SRC_URI[arm.md5sum] = "dfd1f19c0fb6eca41bd9d1f1a8132ba9"
SRC_URI[arm.sha256sum] = "a676274014525074b0cbbc31232ed9c7dd5399a69c4e77bdcc92f5b98f48a1bf"
