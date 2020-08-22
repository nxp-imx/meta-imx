require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2ea799a508804af25dfade43d9d4d5f0"
SRC_URI[aarch64.sha256sum] = "b837ed2424260dea1702f810d18ec242e661ab3520c50c085d0b5a14cf7831ad"
SRC_URI[arm.md5sum] = "74029996c503564efeb575bc4febf5e4"
SRC_URI[arm.sha256sum] = "589efc89633a985a9491b62f97a136a11dadda7060dad115e0c21c710cdd0ea8"
