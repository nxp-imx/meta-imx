require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "84b44b3af80c777f81fc8c6b1bb90ceb"
SRC_URI[aarch64.sha256sum] = "97b4c71391fa81b6153144d05b0bd0c8b4858acc3624405d87db6cb4b7f7ee85"
SRC_URI[arm.md5sum] = "ed93f819f5798497aa99417f4fe66b3a"
SRC_URI[arm.sha256sum] = "8fccf9e25c550e1336d844a4d9c792de5edba63e3a83db84ead104cdb524db0a"
