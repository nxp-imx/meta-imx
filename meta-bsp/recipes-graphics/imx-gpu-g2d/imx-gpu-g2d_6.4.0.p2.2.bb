require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2018a10315fad1600494f810ddc0069e"
SRC_URI[aarch64.sha256sum] = "bd520e827af6f0e44bf8292bff76957e5f0ad05c6116f137e256dc37c6394384"
SRC_URI[arm.md5sum] = "5dadb653cb16cc5986d15a36b1c383c9"
SRC_URI[arm.sha256sum] = "bc83758473463095de6260e2aca0f26759ed7bdbe07e2bcd585ce32b49418ae1"
