require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2a60a4168b2919941138fb00ea90ec76"
SRC_URI[aarch64.sha256sum] = "d3d03b7a16ca26eedab6a28d1f87e3876f9e75b79eb566a1b248292e4683b324"
SRC_URI[arm.md5sum] = "8c60435a0a25cbeca07571848cdca742"
SRC_URI[arm.sha256sum] = "56edf3b9eb79afbabf2cce29cd4a001e8ad1e97c861bb8c6c53aa5af5e3cc90f"
