require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "68d05c3ff64e5c1457bad885e3af359e"
SRC_URI[aarch64.sha256sum] = "b8c34f160256a1574fba0817769b4937eaf13efb292cfc4a75e58e14901f964d"
SRC_URI[arm.md5sum] = "79b9913b99a0589b09d44e45c58851b2"
SRC_URI[arm.sha256sum] = "c1c71b6f1d7a75e894337c4ebe697360293b05e928e588b7db79a3fefe585e93"
