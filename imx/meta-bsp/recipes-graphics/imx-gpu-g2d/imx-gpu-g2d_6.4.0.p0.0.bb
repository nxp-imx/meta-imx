require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "425f1507e97856cea9c87a6542d004b5"
SRC_URI[aarch64.sha256sum] = "7aa0eefbe5f57b24b0062b02a67fa33444819158345df5f183a1eb78f79129ec"
SRC_URI[arm.md5sum] = "f060814d4733a5fe9cd5d0e42706e805"
SRC_URI[arm.sha256sum] = "8e56b5b20271f45db7393edadaa018e0dd3a9b3b3b5d1ce4195df7de1d5d108a"
