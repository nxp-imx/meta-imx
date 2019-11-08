require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "63a650fac701b0e851e337b54e820f74"
SRC_URI[aarch64.sha256sum] = "6ba421ad285eee9c738d530de2126edda9153a4ec6dc5de0d5850801693e9356"
SRC_URI[arm.md5sum] = "81caacb667d099e4f2135de426bfee24"
SRC_URI[arm.sha256sum] = "b15e68775b0469375232a2bb0c7c2d3b98c05e5d834c07c3468fa382df134a62"
