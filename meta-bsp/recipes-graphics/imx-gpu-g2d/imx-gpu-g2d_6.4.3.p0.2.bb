require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f2d08deae4e7d1710acd0ab253c3f6cf"
SRC_URI[aarch64.sha256sum] = "25b50aa0dca75d0759c6e8f1ce401f7516b42fef5cbe18f8e88523d76382e2e6"
SRC_URI[arm.md5sum] = "a76d09026dc8d34e5a5d7415c912e871"
SRC_URI[arm.sha256sum] = "cb5817837f35f7c81d359fcdde7112765bcfa1da4d833607caf558aa4a91343b"
