require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d9bf014f7ed47e783031380489d1d415"
SRC_URI[aarch64.sha256sum] = "a491eb2b80c83d8c44ba42c025f711b57dacf7d145fde4edd9bda367c5d26137"
SRC_URI[arm.md5sum] = "c4c2dc73d51e5b9e2bd60171a1366bbe"
SRC_URI[arm.sha256sum] = "32988d7ede016e9c499be5e32f3a171f90c8f25be09aa97a7a94f9ab823ed6bd"
