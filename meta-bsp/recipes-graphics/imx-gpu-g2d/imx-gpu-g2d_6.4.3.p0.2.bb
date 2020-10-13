require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ae306ee98990f5a3e63437c4c674d003"
SRC_URI[aarch64.sha256sum] = "a8dd557a9daa6ccf47f1baa94bd3940a6e4b48b65546a2484aa38a1215d599ba"
SRC_URI[arm.md5sum] = "b6a256ca2dbfc48be66aad6d0d3d919f"
SRC_URI[arm.sha256sum] = "69fe5628acd97ef3ba10b1644aa0c06c2c7cbebe6f6472640115dd0b8cebfcb0"
