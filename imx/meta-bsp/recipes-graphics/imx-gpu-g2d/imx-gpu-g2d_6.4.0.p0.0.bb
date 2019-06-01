require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "14726907ee447e8c5309e0baf933a638"
SRC_URI[aarch64.sha256sum] = "77ff17a508903045e3684297f8b2fd17682817cea9589a5cd26a4ab004b1268f"
SRC_URI[arm.md5sum] = "6f7d903f80224895dfb28adc95bfd816"
SRC_URI[arm.sha256sum] = "110beb8b909b6647ec1cf36b1e1acf2e998f3e9beb6c33ff69486a52e1d53ea9"
