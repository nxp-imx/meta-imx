require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b20b8d956a32caffd0f656cb944f198d"
SRC_URI[aarch64.sha256sum] = "67ddbcc91c06a86191e84a622964330bb6544d8287dde3cfd7d0a7c3066b9c38"
SRC_URI[arm.md5sum] = "6f7d903f80224895dfb28adc95bfd816"
SRC_URI[arm.sha256sum] = "110beb8b909b6647ec1cf36b1e1acf2e998f3e9beb6c33ff69486a52e1d53ea9"
