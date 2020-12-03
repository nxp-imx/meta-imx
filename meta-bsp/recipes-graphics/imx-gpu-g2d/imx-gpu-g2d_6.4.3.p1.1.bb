require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "102391e22f1e9a4342debe2ac6891989"
SRC_URI[aarch64.sha256sum] = "da2cce707cafe92bd3406b045b49cdfe26ca53f43b344fb8c14181af0439dd8e"
SRC_URI[arm.md5sum] = "16369416cbabbc4b2a59f11f6fcb5932"
SRC_URI[arm.sha256sum] = "4df8322f4d194d87a1ff92495869cfca07b6583d17d26cf85550235fab7e1e5c"
