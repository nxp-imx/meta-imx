require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "67471acc0350a9690b11db510345daa9"
SRC_URI[aarch64.sha256sum] = "9bbbbdec7afa143476b91c120711eb0310918f38320577c6975e621322c810ae"
SRC_URI[arm.md5sum] = "904ece160165404573c1265888076ec4"
SRC_URI[arm.sha256sum] = "bb0fd5d8eaf0d041c00ed1ec5c9f2ffb658cb4fba286f01b29aded15fab4c32a"
