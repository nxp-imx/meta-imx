require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d9de197f0007a86ac7213b883c8ca0c4"
SRC_URI[aarch64.sha256sum] = "33eee1000eb3b08928b700d64d45af01accd2d4bc426e317792770537822c831"
SRC_URI[arm.md5sum] = "824344bdb0096704e23b4be5a973dca2"
SRC_URI[arm.sha256sum] = "30b14bfbfa16aec2ca2d06b885c800812993192c75aac13abd4a56819991e8e6"
