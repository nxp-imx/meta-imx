require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e464cc676f7656a2ff3d0ba157498100"
SRC_URI[aarch64.sha256sum] = "41d436dc9bf5287a730eb559090a95c6694422f36c94fc616c0f15a07806d766"
SRC_URI[arm.md5sum] = "0a689256b7fbf3b29ff518e163379a66"
SRC_URI[arm.sha256sum] = "1a947c384adae6364a31cb121602aefdb3862ec953e1f7d4a1d01e5470884830"
