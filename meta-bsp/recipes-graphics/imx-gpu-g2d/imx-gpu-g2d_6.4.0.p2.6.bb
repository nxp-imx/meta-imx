require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "63abcd8abac2b7254538657832647b25"
SRC_URI[aarch64.sha256sum] = "1e639187bd06cffa24f1d1150fe6b5faf01dc98aa5301ea8625943661cfe5b48"
SRC_URI[arm.md5sum] = "b658b4a9936ce8d7de5a2a9c8ba0170b"
SRC_URI[arm.sha256sum] = "fa899a1b90a5c9782adc2d210f6e21ef7dc1db7f5e72ce60142c8eab8d0c2e58"
