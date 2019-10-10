require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "555b0016ee943963d14bd87635461beb"
SRC_URI[aarch64.sha256sum] = "06bf84de1fe03fbc6d2f963ee3e60745172e29e770a997b27515adcd656551fd"
SRC_URI[arm.md5sum] = "79a1264b9750117b9bac77b8ff0d2c44"
SRC_URI[arm.sha256sum] = "b0d971ffed91d1ff61cdab03cdfaba991a232f6097f925023a9117237d27e15c"
