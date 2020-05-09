require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "3ffc1759b18256057ff5307c2a31ad46"
SRC_URI[aarch64.sha256sum] = "dc7b059b00f51c7e14b69a401b35cfde025d7973a040b8f4945fb36b5420eb6b"
SRC_URI[arm.md5sum] = "73e2fc5f0f113bd38e28bb1efc1d9947"
SRC_URI[arm.sha256sum] = "a1070cbd022ae8782b0b3e245a2851f47852c502428051c3a7915c7724ec1fc6"
