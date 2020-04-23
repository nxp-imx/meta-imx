require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "680db8eb1e2ad5ed53293e77c0db2929"
SRC_URI[aarch64.sha256sum] = "1e6fd0783f382696d1a15d55d5c3c79c258a5d6631ccdc441f3dbaeadd4ad42c"
SRC_URI[arm.md5sum] = "b4b3113853f76581a0ddaadcd8f38657"
SRC_URI[arm.sha256sum] = "43af72bb478be6d0aaccd9eaac934cf7fd59aed85bf1e2a1b682574262d58f31"
