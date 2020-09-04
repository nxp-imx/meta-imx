require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "304b228c21e73de64eaca80dd2813e4f"
SRC_URI[aarch64.sha256sum] = "746d7b1f4db35b31d5a07b00827ca14cfedca4171371b7f5288be2cd5c53ec6b"
SRC_URI[arm.md5sum] = "ad73307ce1971490c99f18414d69c85f"
SRC_URI[arm.sha256sum] = "d1ff6abd0d69b1a8add8da904afa8e454f5e544edade99a136fb4b5c80bfdc63"
