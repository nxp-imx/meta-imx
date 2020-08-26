require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a2b8801a19320d0dc23262d954541ffa"
SRC_URI[aarch64.sha256sum] = "f09cfe534cc86fa94c4db1e46b6d7f8be3737a6cd16e8e62de29f39d8ba0a79e"
SRC_URI[arm.md5sum] = "54d2209adaf291957de2de5796f71a55"
SRC_URI[arm.sha256sum] = "7f8c2272913fa392fd08d9599c2b3aee08304aa1907d6d0b0f0e04671640de61"
