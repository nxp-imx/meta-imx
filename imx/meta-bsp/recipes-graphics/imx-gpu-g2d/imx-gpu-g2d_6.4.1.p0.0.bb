require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "c661dfe1bb255ebd392a4250a5efd964"
SRC_URI[aarch64.sha256sum] = "beeeaf127252f06cb14dbc2d5e52f1e7abc3e6a2126099348afb164abc0bee3b"
SRC_URI[arm.md5sum] = "a37d1fdb28af064d803e63a3b3c0ed9a"
SRC_URI[arm.sha256sum] = "32d2784eea65802268d78a15d4ebd79cc3850575677eda65fe111a9a68760250"
