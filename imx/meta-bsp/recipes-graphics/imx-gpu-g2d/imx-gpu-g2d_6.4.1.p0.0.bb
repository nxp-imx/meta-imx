require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "c661dfe1bb255ebd392a4250a5efd964"
SRC_URI[aarch64.sha256sum] = "beeeaf127252f06cb14dbc2d5e52f1e7abc3e6a2126099348afb164abc0bee3b"
SRC_URI[arm.md5sum] = "85bba00531d77f2921a339ef4eac1dfd"
SRC_URI[arm.sha256sum] = "278d8563a4285b29d830e040a0d1d23ff5e2a89bf4a8b89e7bc9a4e36aa4a935"
