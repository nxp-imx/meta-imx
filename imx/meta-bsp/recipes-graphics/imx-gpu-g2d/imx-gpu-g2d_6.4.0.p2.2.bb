require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "551460b7b8aea6ecba49db942f903e2e"
SRC_URI[aarch64.sha256sum] = "77a4ade399489a51e7bc641a4da4e3168a4c3a0aa1266bab4bad1f6ff68a1f96"
SRC_URI[arm.md5sum] = "4ec38f6a3d0dd7ea94b915a234817dc8"
SRC_URI[arm.sha256sum] = "923ab760ef0d2bcfea2f04628b3da44596825fb706d1a3aa2767c1c86d419aa4"
