require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "68d05c3ff64e5c1457bad885e3af359e"
SRC_URI[aarch64.sha256sum] = "b8c34f160256a1574fba0817769b4937eaf13efb292cfc4a75e58e14901f964d"
SRC_URI[arm.md5sum] = "188349f4861976c8768ad6caf3496482"
SRC_URI[arm.sha256sum] = "0f2d31f3d79b4a9c23e7c6aa7089bca12168e20c923de8f90eef19fdddd43f3d"
