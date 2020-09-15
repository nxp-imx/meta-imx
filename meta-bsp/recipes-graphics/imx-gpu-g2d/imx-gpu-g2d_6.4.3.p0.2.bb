require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d41d35771e2f78c6a27060e98b7e70f9"
SRC_URI[aarch64.sha256sum] = "877de63fee0c12de0b295a203c18d9ccc0796d5e549ebd4de626370d3b5c93da"
SRC_URI[arm.md5sum] = "bd2b5bfff976249e58452ce7f1165ba1"
SRC_URI[arm.sha256sum] = "65f406ead0d1bd7f8ab88ace31d4bda9e1d9c64af30fcb80769468c8c4bf1ab2"
