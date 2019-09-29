require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "555b0016ee943963d14bd87635461beb"
SRC_URI[aarch64.sha256sum] = "06bf84de1fe03fbc6d2f963ee3e60745172e29e770a997b27515adcd656551fd"
SRC_URI[arm.md5sum] = "821e1d8711dae12230f46d206dd25140"
SRC_URI[arm.sha256sum] = "cc74c3d342242023e33a3ee2884e011c7edcb37b70ea0c199678b7696fa0d6d7"
