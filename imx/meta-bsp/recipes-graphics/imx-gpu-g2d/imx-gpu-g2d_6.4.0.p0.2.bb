require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "061ac3ba66477e309ee592a7a8b962fc"
SRC_URI[aarch64.sha256sum] = "fade3aac1be410cd577f3b76607c39d49411c03f9ed6d2b0ff9c7eb851cebd1b"
SRC_URI[arm.md5sum] = "5d8e69622cd00b5adfb6e89ae9b4e29d"
SRC_URI[arm.sha256sum] = "cbb354965de0bb32dc59092e65813e01072f6226bf94296925d339a9cd6958ca"
