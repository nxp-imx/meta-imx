require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a3172359082ca4cb7d4570b080cabe6d"
SRC_URI[aarch64.sha256sum] = "ae681bdf649f3613e08d767c46e6d5d8e806cb0bee7af226ec67d74eb389c33d"
SRC_URI[arm.md5sum] = "8c60435a0a25cbeca07571848cdca742"
SRC_URI[arm.sha256sum] = "56edf3b9eb79afbabf2cce29cd4a001e8ad1e97c861bb8c6c53aa5af5e3cc90f"
