require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "49adfe81bdb1d1def9228bf6522eeb4e"
SRC_URI[aarch64.sha256sum] = "9498322376a1886d064c0f2c20b86b05ae82cd763d0c17862603d10ab3355835"
SRC_URI[arm.md5sum] = "de990e5c6b76f7fbe0f33f350112e358"
SRC_URI[arm.sha256sum] = "f0ead0786fc3566fd40b9d4c4defd612232319a4cb813db59b79dd4fdd52b7df"
