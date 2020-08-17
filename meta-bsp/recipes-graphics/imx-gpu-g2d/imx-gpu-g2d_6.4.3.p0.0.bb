require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8a9e2d9aa57c227b119d2ae1076df0d0"
SRC_URI[aarch64.sha256sum] = "e3feb9d60c1bfac76d4ef20941c5b5a8f98525b6dda12cb780e95f4022d93cd5"
SRC_URI[arm.md5sum] = "bf5b51e51bd62de165fffe101a100f36"
SRC_URI[arm.sha256sum] = "5b793d4224ca224af27e6143cf356ebc8254a975ff3b01ef2732e52e296b4a92"
