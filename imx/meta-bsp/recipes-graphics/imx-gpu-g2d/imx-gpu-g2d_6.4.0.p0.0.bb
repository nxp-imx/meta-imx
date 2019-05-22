require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d9c0c499743fd70d0c9da10c817e7476"
SRC_URI[aarch64.sha256sum] = "d2cff5a81c156a60658960091f904b79492d188e5d3318f03368f15cae8ce768"
SRC_URI[arm.md5sum] = "c6c6b7a0356af7fb7cab6f1b0eaef7c9"
SRC_URI[arm.sha256sum] = "2455327f15a3e84378f27d61b0c390ce76832a9c1a204f88336b977611b76dc5"
