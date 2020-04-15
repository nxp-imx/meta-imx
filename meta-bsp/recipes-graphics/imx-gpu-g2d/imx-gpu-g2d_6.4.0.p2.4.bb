require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "37bc40da87570a8a3c4c9d5c05b5e7e8"
SRC_URI[aarch64.sha256sum] = "91e940886aefb76392213d2b456b87ebf0245eac62b7916e0079826272040bc0"
SRC_URI[arm.md5sum] = "13ef5c5fb366865a31d54a908553152a"
SRC_URI[arm.sha256sum] = "e488438c06ca337a09518a175a50f56598ed53ce7571c1978efadfc33f091a19"
