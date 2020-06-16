require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9898c3cb3ae3a682400dca5555f8a928"
SRC_URI[aarch64.sha256sum] = "9456ad410d24ef42dde2ccfe1a47f8c870f829a1f110ac3aa97d865cf291a27b"
SRC_URI[arm.md5sum] = "081e422414f772300617395f8be52c86"
SRC_URI[arm.sha256sum] = "e8a639b098239a0e119bf172d4f4bc4717c38f64c16cb1207505ab02bdb1a169"
