require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "658afd59b917cee7e483d73eb44cf672"
SRC_URI[aarch64.sha256sum] = "38fdcc4e2cbc8f9520bd774bf00e2e4a3ff881adea00dfdc5832687676dac19d"
SRC_URI[arm.md5sum] = "d525fc71fd502398e4198cb6e63f03db"
SRC_URI[arm.sha256sum] = "5531ff9961da5364808078d0e59930f35f1d589a8cc67e84f9a446a8a34e32f1"
