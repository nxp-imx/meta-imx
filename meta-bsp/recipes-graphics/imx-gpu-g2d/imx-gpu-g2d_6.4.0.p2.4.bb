require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f23ee99465720de10b9e90d93bb1ac76"
SRC_URI[aarch64.sha256sum] = "45d43340074a9c6edd6421b32cadf7ce74d422e9fce495c1cbd8ff0291c0f04f"
SRC_URI[arm.md5sum] = "7a0d1848b64d024de4a310177db9e0eb"
SRC_URI[arm.sha256sum] = "e1e9d0eafeb882684f12c03fa374b8ca64ace5bb15f591c046dd7619c8b2386f"
