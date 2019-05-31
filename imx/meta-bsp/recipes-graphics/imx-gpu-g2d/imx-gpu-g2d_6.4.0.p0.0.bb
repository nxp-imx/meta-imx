require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "3971bf63039860d8536e46c00aa9bb7d"
SRC_URI[aarch64.sha256sum] = "d77aa1a4942dd9e9e3af167a347c518b3e041a486abaa960092dbd5db691078d"
SRC_URI[arm.md5sum] = "c03415832c45309596ba2da926f68cd6"
SRC_URI[arm.sha256sum] = "e1e81d59292728b1160559d8b0b95bf4e51c205fe19a3546f2ffdb798d5cbc40"
