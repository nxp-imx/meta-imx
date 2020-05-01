require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f23ee99465720de10b9e90d93bb1ac76"
SRC_URI[aarch64.sha256sum] = "45d43340074a9c6edd6421b32cadf7ce74d422e9fce495c1cbd8ff0291c0f04f"
SRC_URI[arm.md5sum] = "251ffa3294500196600d985a01a2f8c4"
SRC_URI[arm.sha256sum] = "ee3406f7b9ac77d101eff614490e2b285b6d46fe271f943904e94507ab2a014b"
