require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "0c99aa40747923636a721f6a43bafcc2"
SRC_URI[aarch64.sha256sum] = "4b480cc8d55713336e8142d3f4974f2f1ff8eac8561b25c523d120e9f1c7be88"
SRC_URI[arm.md5sum] = "576bba073462efe18692956a98665c39"
SRC_URI[arm.sha256sum] = "536dccc1ec15d97a379c597b6360542b41bc255457f276d69d8f63662950b414"
