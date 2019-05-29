require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "425f1507e97856cea9c87a6542d004b5"
SRC_URI[aarch64.sha256sum] = "7aa0eefbe5f57b24b0062b02a67fa33444819158345df5f183a1eb78f79129ec"
SRC_URI[arm.md5sum] = "46ba9eb64464b81f86a5d020a2743661"
SRC_URI[arm.sha256sum] = "070d9f8b2fd6b9a6d42cf345ece523e8149301265d556864603bcffba408b0f7"
