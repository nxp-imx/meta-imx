require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "1fe29bbe1f64a723cfe3046aed5fef84"
SRC_URI[aarch64.sha256sum] = "5342809fe90611ce93b038c15abd87354dcd0c844be4308e9ac0ad150ddd8ce0"
SRC_URI[arm.md5sum] = "87857a4e9e32a81528923584933226e9"
SRC_URI[arm.sha256sum] = "05c3add9b2b94f3e274718501b3ee8a0ec74b6ffb025ab6171cf55cf68313b64"
