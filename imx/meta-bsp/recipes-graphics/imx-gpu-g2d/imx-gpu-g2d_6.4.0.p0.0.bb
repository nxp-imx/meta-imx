require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "4e033375de20fd31b2bb610d50432605"
SRC_URI[aarch64.sha256sum] = "23baf0eff2d456a5294d7521ef204b74b02e9182014ef1a4030aa4748b59933f"
SRC_URI[arm.md5sum] = "f060814d4733a5fe9cd5d0e42706e805"
SRC_URI[arm.sha256sum] = "8e56b5b20271f45db7393edadaa018e0dd3a9b3b3b5d1ce4195df7de1d5d108a"
