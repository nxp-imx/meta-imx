require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=e9e880185bda059c90c541d40ceca922" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "eff04d8fe71497018d6e004f44ada8cd"
SRC_URI[aarch64.sha256sum] = "b4f7ab8dca95449cf61135b72465664264ab238be8cf9eaff8f06ab94bca1cad"
SRC_URI[arm.md5sum] = "6e2923e587a43f17518f0a1449dd6112"
SRC_URI[arm.sha256sum] = "a55e0ea53276ecf79450e71497bd571cdbd0318fe5dea6b26425f710ca90b499"
