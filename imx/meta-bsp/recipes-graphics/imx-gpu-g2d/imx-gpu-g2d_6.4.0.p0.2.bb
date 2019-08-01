require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "95e5b6ef196981ed8a0fef4e9af608ae"
SRC_URI[aarch64.sha256sum] = "eff70ae60351f8d5d48a44609f0fc1b683e1b6798c326c12641faf92d19d821c"
SRC_URI[arm.md5sum] = "612cec451ee701c831f3f505ea3d14db"
SRC_URI[arm.sha256sum] = "c5753485dda4b23c0819c367c6131ec05a6ef7fc95a21b099d0c72d6f2ea83d9"
