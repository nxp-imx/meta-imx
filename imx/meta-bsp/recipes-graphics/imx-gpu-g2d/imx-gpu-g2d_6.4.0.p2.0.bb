require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "128043a4754330fd33277efcbb911f6f"
SRC_URI[aarch64.sha256sum] = "74565fb267978dd0202bfdea305acba8facf6fcab618e4e832c86a2b3f6d8224"
SRC_URI[arm.md5sum] = "0e82c75b81e858079894215d7e7fc035"
SRC_URI[arm.sha256sum] = "52f7b316fcdd7c5b3ffd00c10802d2b15f679ffc81fa7f8fc0ff931cb48b88ea"
