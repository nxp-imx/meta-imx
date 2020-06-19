require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e7e952509adb5e887d65632dce1df0cd"
SRC_URI[aarch64.sha256sum] = "24f91f6f892466b4dbe690e9ce23bc4f26f4cbf0049aea60fc374e871082be9e"
SRC_URI[arm.md5sum] = "83d2422bebe44b8a4f6202cfc710ef3b"
SRC_URI[arm.sha256sum] = "4953ffe0beb43056ba3ced7ad14c712344a0bd7004701fe7e09102e4f89135cd"
