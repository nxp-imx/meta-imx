require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e934ed10c64d127336072a625495cbc7"
SRC_URI[aarch64.sha256sum] = "a5865d2613f2905285dddd41e79a5711f6e806b1e546fc7020a7a132b5fe2829"
SRC_URI[arm.md5sum] = "c4c2dc73d51e5b9e2bd60171a1366bbe"
SRC_URI[arm.sha256sum] = "32988d7ede016e9c499be5e32f3a171f90c8f25be09aa97a7a94f9ab823ed6bd"
