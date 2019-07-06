require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "79fe07177a9854c9dbf3efda1d2006da"
SRC_URI[aarch64.sha256sum] = "66a8a42097920eda1a4a47545af998756e46226d472bb249a4e4fca8e595e594"
SRC_URI[arm.md5sum] = "9739061b5a8356c6af78900fbcc3f525"
SRC_URI[arm.sha256sum] = "2fcfcff37f46eba7cad45e45ef65f5c88dd9dae925357f2583ae3a994352ed5d"
