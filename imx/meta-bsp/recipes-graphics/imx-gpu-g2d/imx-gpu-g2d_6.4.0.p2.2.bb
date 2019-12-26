require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "1c396e0eca9ecf11aeb0100c5e35d7c5"
SRC_URI[aarch64.sha256sum] = "4a2674db2dc02579ae2aa98230b2012f30f69f023c5af421d9f7c4bf596ec265"
SRC_URI[arm.md5sum] = "4ec38f6a3d0dd7ea94b915a234817dc8"
SRC_URI[arm.sha256sum] = "923ab760ef0d2bcfea2f04628b3da44596825fb706d1a3aa2767c1c86d419aa4"
