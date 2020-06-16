require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "1fe29bbe1f64a723cfe3046aed5fef84"
SRC_URI[aarch64.sha256sum] = "5342809fe90611ce93b038c15abd87354dcd0c844be4308e9ac0ad150ddd8ce0"
SRC_URI[arm.md5sum] = "081e422414f772300617395f8be52c86"
SRC_URI[arm.sha256sum] = "e8a639b098239a0e119bf172d4f4bc4717c38f64c16cb1207505ab02bdb1a169"
