require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d781e3ede1c968c748db804b7c990d74"
SRC_URI[aarch64.sha256sum] = "cd6f757abd85144083db6956f561471da2be726b927436a3e8932696bacd7e69"
SRC_URI[arm.md5sum] = "40584a83eb3b3219c712c24a0de639d1"
SRC_URI[arm.sha256sum] = "a81a481c191496540bd82113af48b6055a33a6a185ce55d46b18bdbb4ac70883"
