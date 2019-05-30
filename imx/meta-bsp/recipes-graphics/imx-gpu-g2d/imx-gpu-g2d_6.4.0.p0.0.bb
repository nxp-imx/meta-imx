require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "3971bf63039860d8536e46c00aa9bb7d"
SRC_URI[aarch64.sha256sum] = "d77aa1a4942dd9e9e3af167a347c518b3e041a486abaa960092dbd5db691078d"
SRC_URI[arm.md5sum] = "84b894d105f5d9614fe50310bce8d830"
SRC_URI[arm.sha256sum] = "f6db98d1c5f5ddd3a2f63182aea413f7fb41c1dc3cdab47fb268d79eef7ffbe7"
