require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "874dc56f7715b0769b633db2e0705131"
SRC_URI[aarch64.sha256sum] = "2acf8e3bb7dbc3f69d8de2c5852cceba26829a619b78b9eead280360bd964c78"
SRC_URI[arm.md5sum] = "98b4b3bcd4c823ecd523c0c9abc233d3"
SRC_URI[arm.sha256sum] = "ce43172c1f54c9295b3635ca63655738cb7ca407028429f069d2b825c9408edd"
