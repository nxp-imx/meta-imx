require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6a0d2481fa8d5025f3aca71caa26faaf"
SRC_URI[aarch64.sha256sum] = "0d21e650515c617871463aed0fb13e95651c19b51721b49b20e5c147cec0dcf5"
SRC_URI[arm.md5sum] = "a14facaecd3143c6bcdb1deccc588542"
SRC_URI[arm.sha256sum] = "338e3be1ca3adb6a8fa0bd61bf1108bf90d29974393d2dbb0f5591897b19adf9"
