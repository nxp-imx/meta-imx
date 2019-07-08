require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "55ae982e0b462cc454613eadd7512f9e"
SRC_URI[aarch64.sha256sum] = "dc14833bdd54ce5ed7d4c179cb2ed13ff3709422e67d512829041ce06e041d02"
SRC_URI[arm.md5sum] = "a14facaecd3143c6bcdb1deccc588542"
SRC_URI[arm.sha256sum] = "338e3be1ca3adb6a8fa0bd61bf1108bf90d29974393d2dbb0f5591897b19adf9"
