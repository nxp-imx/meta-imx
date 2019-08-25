require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2639de602bb225e6b17a3344bdd1616d"
SRC_URI[aarch64.sha256sum] = "df4931a330ceb74350c55e39ca6e3e96edf148eba50e4d82b06cfb630d181262"
SRC_URI[arm.md5sum] = "5d8e69622cd00b5adfb6e89ae9b4e29d"
SRC_URI[arm.sha256sum] = "cbb354965de0bb32dc59092e65813e01072f6226bf94296925d339a9cd6958ca"
