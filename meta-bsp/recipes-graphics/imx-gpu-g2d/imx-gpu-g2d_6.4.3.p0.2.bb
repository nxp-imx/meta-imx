require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6571f0d7c2b4f90a8b6c1cdff62791ba"
SRC_URI[aarch64.sha256sum] = "271ee6e7a613e0959198388442008b41b9875c95c8f32cc598266adf364c545d"
SRC_URI[arm.md5sum] = "b6a256ca2dbfc48be66aad6d0d3d919f"
SRC_URI[arm.sha256sum] = "69fe5628acd97ef3ba10b1644aa0c06c2c7cbebe6f6472640115dd0b8cebfcb0"
