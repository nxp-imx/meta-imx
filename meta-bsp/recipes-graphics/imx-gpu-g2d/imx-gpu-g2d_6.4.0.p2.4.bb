require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "caa4e1b4996d7020cd4ac59e3bb66827"
SRC_URI[aarch64.sha256sum] = "fb3e04540d5b485cda50ab33f12b3898585c46965df64a3c09d6b6ad7a6fe1f0"
SRC_URI[arm.md5sum] = "027da858374887ecdf3876a976299dc3"
SRC_URI[arm.sha256sum] = "a9ab58887ffcd126368e28730c1c9bad67a3aaf3ea06460187155e4b4e94e152"
