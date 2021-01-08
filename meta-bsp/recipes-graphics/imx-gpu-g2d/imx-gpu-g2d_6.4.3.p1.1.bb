require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "071d6f38f1e000def3f863def3a8affb"
SRC_URI[aarch64.sha256sum] = "919489face69d6abd6e9d5896ed46c851b1b052ca8292b9044ef002f21d17a68"
SRC_URI[arm.md5sum] = "ec3036747b2d22adcf02201f032dfedf"
SRC_URI[arm.sha256sum] = "ad8ae57cf8cf797995c70f87ed7fa290b4c8438b1e96bdd1e7f6c2fcb3c5e206"
