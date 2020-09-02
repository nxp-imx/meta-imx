require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "304b228c21e73de64eaca80dd2813e4f"
SRC_URI[aarch64.sha256sum] = "746d7b1f4db35b31d5a07b00827ca14cfedca4171371b7f5288be2cd5c53ec6b"
SRC_URI[arm.md5sum] = "d4d31ae5c6abc297c789c9ad86d981d9"
SRC_URI[arm.sha256sum] = "c362803e80306c2a522c5ea52f964066f9e565ca0964f6d63e1d9ae6f9907b3e"
