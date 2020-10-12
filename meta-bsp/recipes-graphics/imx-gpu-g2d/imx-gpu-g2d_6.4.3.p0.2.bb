require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ae306ee98990f5a3e63437c4c674d003"
SRC_URI[aarch64.sha256sum] = "a8dd557a9daa6ccf47f1baa94bd3940a6e4b48b65546a2484aa38a1215d599ba"
SRC_URI[arm.md5sum] = "570c0b81d368a38861f0f495d414374b"
SRC_URI[arm.sha256sum] = "9758d311c0987c54e8c467a114675d0271a863859ab0067a80a090a3c35dc20d"
