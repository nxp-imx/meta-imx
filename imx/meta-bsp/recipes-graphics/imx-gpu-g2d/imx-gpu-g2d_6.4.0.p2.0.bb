require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "47f249abd32883a86d82b437357a1be6"
SRC_URI[aarch64.sha256sum] = "a5b5c879dc47e0e6ea90270aef04a7253580106ab02ec881c51315fdbeb8e49d"
SRC_URI[arm.md5sum] = "5bd08ffdcecdfec52c192b02181dc26e"
SRC_URI[arm.sha256sum] = "75e708c456e51cf2a264ec6836735d809462fb2593f2885e2e922ac455383d22"
