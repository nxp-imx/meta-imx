require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8b040e3f57bfe21dba622a56c3025708"
SRC_URI[aarch64.sha256sum] = "a61eb4cc83dfc07846150aff8b2908f776a068359d7efb0bbad28c6884933de4"
SRC_URI[arm.md5sum] = "b658b4a9936ce8d7de5a2a9c8ba0170b"
SRC_URI[arm.sha256sum] = "fa899a1b90a5c9782adc2d210f6e21ef7dc1db7f5e72ce60142c8eab8d0c2e58"
