require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "70486c8a5a6958ada2d09c3408aeb3e6"
SRC_URI[aarch64.sha256sum] = "c3108634a5a1eb68e43109351d9ffe7ec9a815c59bfa127ea04a4748feb054e1"
SRC_URI[arm.md5sum] = "bf89b9bb1fec80f6796cc1e2f27f0ff4"
SRC_URI[arm.sha256sum] = "3883c8d46c39d23eb88a46830272f3f39bd11abbb145bf9ca09762739e45e5ab"
