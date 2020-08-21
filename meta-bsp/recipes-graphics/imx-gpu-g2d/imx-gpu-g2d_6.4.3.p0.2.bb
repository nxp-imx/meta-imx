require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "78c34289b065a8039fa3c6fc46adc604"
SRC_URI[aarch64.sha256sum] = "de3d5e864377e6e4c355c141013034968fde011192694292a14ec1949c01e6ee"
SRC_URI[arm.md5sum] = "a76d09026dc8d34e5a5d7415c912e871"
SRC_URI[arm.sha256sum] = "cb5817837f35f7c81d359fcdde7112765bcfa1da4d833607caf558aa4a91343b"
