require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d9bf014f7ed47e783031380489d1d415"
SRC_URI[aarch64.sha256sum] = "a491eb2b80c83d8c44ba42c025f711b57dacf7d145fde4edd9bda367c5d26137"
SRC_URI[arm.md5sum] = "f441c3eb7c7497038ed3b1ab4dc865a3"
SRC_URI[arm.sha256sum] = "c68d8608b3cf724fa6e7153efeb9fece4929e19bd86a487515b73c29b2ec04f1"
