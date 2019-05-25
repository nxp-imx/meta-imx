require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "4e033375de20fd31b2bb610d50432605"
SRC_URI[aarch64.sha256sum] = "23baf0eff2d456a5294d7521ef204b74b02e9182014ef1a4030aa4748b59933f"
SRC_URI[arm.md5sum] = "2a9da4892871bca521b3ba19befda12c"
SRC_URI[arm.sha256sum] = "698e4f7d68f90c9f548fdcff49895d4905b08e78590bb9ff0c19211409b752fe"
