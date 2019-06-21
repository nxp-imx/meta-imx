require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f486815713a4412a42ac51926cbbbd79"
SRC_URI[aarch64.sha256sum] = "215672ac31d389ba0c74d16957ab23a78354c3a4d4c80e9ea3bb6be108ab39a4"
SRC_URI[arm.md5sum] = "81617378151db2371434fe54c28abae4"
SRC_URI[arm.sha256sum] = "d14d7b9a2356a7ba1dd85a03538ab4838c501063db44b905ed12379225468b78"
