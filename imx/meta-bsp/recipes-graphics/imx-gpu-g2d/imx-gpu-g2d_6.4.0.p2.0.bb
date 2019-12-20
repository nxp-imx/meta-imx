require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "31256acce9b9272e3d0b951acf473562"
SRC_URI[aarch64.sha256sum] = "02dba5dbb51dfdab313ec87fc409740d3afee522f03b7b5babd882812ac53c0a"
SRC_URI[arm.md5sum] = "31dc42124e0c2b76b1aed41e0aac1414"
SRC_URI[arm.sha256sum] = "92fabf1dd01e8a1cffa9932d7b659332d4ba8fc71f502a0a6aadb420641df6a9"
