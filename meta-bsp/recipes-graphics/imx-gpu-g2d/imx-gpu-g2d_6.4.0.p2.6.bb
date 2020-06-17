require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e7e952509adb5e887d65632dce1df0cd"
SRC_URI[aarch64.sha256sum] = "24f91f6f892466b4dbe690e9ce23bc4f26f4cbf0049aea60fc374e871082be9e"
SRC_URI[arm.md5sum] = "f9bda79816930ab14b89bffa5107cb76"
SRC_URI[arm.sha256sum] = "ce7e4089d9896bff10e181d4f0a9868f8084315522e8b573238b96a14d34ec61"
