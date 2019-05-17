require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "930faad95410814ccbc50df92373fe46"
SRC_URI[aarch64.sha256sum] = "92648440dc354026d887bf681adf0afd05de3c558015dbee663bdb0f522e4b65"
SRC_URI[arm.md5sum] = "1b53929caceb19ef48c5541a54ae5a6b"
SRC_URI[arm.sha256sum] = "f933038bbedd4a891df280805f253e3d4957e81df29d6115c3330932ff53fc0c"
