require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "46ad5144e14b72b15c4603bdd8e95560"
SRC_URI[aarch64.sha256sum] = "13f8d84f5403affb8a2e25662bf6cedaed08eecde7bf37236a5555fc2304a25f"
SRC_URI[arm.md5sum] = "9dc0e7cd917c050218598a04a039c350"
SRC_URI[arm.sha256sum] = "b05bc65b047ff85a5b65bc13d925e64c0eeeb1f2e3a8c1a28ed50a7c08570ace"
