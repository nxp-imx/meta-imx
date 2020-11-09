require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "78c77b7214c99128a8607d61dd36081f"
SRC_URI[aarch64.sha256sum] = "b5f253e10a9651c9afbcf01e90b671b391163a012d8b347e356c0964645307eb"
SRC_URI[arm.md5sum] = "317c611cadd64ee065d085a0965134d5"
SRC_URI[arm.sha256sum] = "7498898ffb389b92e65daa84a7589ea814110da47be5bcc63d586943137a628e"
