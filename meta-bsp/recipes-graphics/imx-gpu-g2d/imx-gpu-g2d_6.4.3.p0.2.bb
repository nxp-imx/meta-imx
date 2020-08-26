require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "79730102fff166ac396a1001229f8c26"
SRC_URI[aarch64.sha256sum] = "04a002293b9114e45d129b6023c0cf3eea446fe7aa48a53059230ee6782e086d"
SRC_URI[arm.md5sum] = "54d2209adaf291957de2de5796f71a55"
SRC_URI[arm.sha256sum] = "7f8c2272913fa392fd08d9599c2b3aee08304aa1907d6d0b0f0e04671640de61"
