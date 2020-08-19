require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d781e3ede1c968c748db804b7c990d74"
SRC_URI[aarch64.sha256sum] = "cd6f757abd85144083db6956f561471da2be726b927436a3e8932696bacd7e69"
SRC_URI[arm.md5sum] = "eedad89c96154e6e0b4bf3d9f1d1356b"
SRC_URI[arm.sha256sum] = "d9b7ef6e35002595273a112b7deb7f6f9801618da6f74ed8f9467460d135bdad"
