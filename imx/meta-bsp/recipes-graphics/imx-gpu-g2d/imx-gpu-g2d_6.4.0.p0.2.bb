require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "55ae982e0b462cc454613eadd7512f9e"
SRC_URI[aarch64.sha256sum] = "dc14833bdd54ce5ed7d4c179cb2ed13ff3709422e67d512829041ce06e041d02"
SRC_URI[arm.md5sum] = "9739061b5a8356c6af78900fbcc3f525"
SRC_URI[arm.sha256sum] = "2fcfcff37f46eba7cad45e45ef65f5c88dd9dae925357f2583ae3a994352ed5d"
