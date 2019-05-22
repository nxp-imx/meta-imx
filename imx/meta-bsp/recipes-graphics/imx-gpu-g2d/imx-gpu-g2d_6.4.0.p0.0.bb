require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d9c0c499743fd70d0c9da10c817e7476"
SRC_URI[aarch64.sha256sum] = "d2cff5a81c156a60658960091f904b79492d188e5d3318f03368f15cae8ce768"
SRC_URI[arm.md5sum] = "0a689256b7fbf3b29ff518e163379a66"
SRC_URI[arm.sha256sum] = "1a947c384adae6364a31cb121602aefdb3862ec953e1f7d4a1d01e5470884830"
