require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8cb6290e8deffc1de6bd80f86e2a32d2"
SRC_URI[aarch64.sha256sum] = "92631d66d349d7339192b9e7b172123b4ac387eb74f9445008917e25785cb7e5"
SRC_URI[arm.md5sum] = "821e1d8711dae12230f46d206dd25140"
SRC_URI[arm.sha256sum] = "cc74c3d342242023e33a3ee2884e011c7edcb37b70ea0c199678b7696fa0d6d7"
