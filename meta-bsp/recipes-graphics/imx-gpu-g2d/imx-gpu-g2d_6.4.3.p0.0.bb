require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2057d89b85089574a3afd4d5b3354861"
SRC_URI[aarch64.sha256sum] = "535cc62576231e2e26acd240cce7f249717d4a8326d49b6de8e1ecf8c1df86b4"
SRC_URI[arm.md5sum] = "3f14039dae9e13640c91201d2f337de2"
SRC_URI[arm.sha256sum] = "8e4e5141782b7ea3b7f7d1a499095376267e8f92129682d824687ccd758a76c6"
