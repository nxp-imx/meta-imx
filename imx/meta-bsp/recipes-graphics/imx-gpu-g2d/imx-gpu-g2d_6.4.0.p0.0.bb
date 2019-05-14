require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "930faad95410814ccbc50df92373fe46"
SRC_URI[aarch64.sha256sum] = "92648440dc354026d887bf681adf0afd05de3c558015dbee663bdb0f522e4b65"
SRC_URI[arm.md5sum] = "fec557d32cfa79f6e52dfaad24c2985f"
SRC_URI[arm.sha256sum] = "bf19bf84c1156e00998cf65aa1904b89ee23d9d9f08c8efead2be2c56f427d2a"
