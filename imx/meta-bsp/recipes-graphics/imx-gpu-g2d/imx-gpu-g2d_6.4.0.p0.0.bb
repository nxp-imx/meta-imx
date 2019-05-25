require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "c1464364bd7445bf73e577b01565fe3e"
SRC_URI[aarch64.sha256sum] = "9209c043008fa47442934785e70426d701da59731ba4b1bbc022616cc61fdee6"
SRC_URI[arm.md5sum] = "2a9da4892871bca521b3ba19befda12c"
SRC_URI[arm.sha256sum] = "698e4f7d68f90c9f548fdcff49895d4905b08e78590bb9ff0c19211409b752fe"
