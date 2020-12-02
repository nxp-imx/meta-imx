require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "102391e22f1e9a4342debe2ac6891989"
SRC_URI[aarch64.sha256sum] = "da2cce707cafe92bd3406b045b49cdfe26ca53f43b344fb8c14181af0439dd8e"
SRC_URI[arm.md5sum] = "9f9a174744c797596fe6e517c770d73b"
SRC_URI[arm.sha256sum] = "96f0ad8e3fcc5fedb10335b492defdfd87b40b92d929643268cee30594e269ec"
