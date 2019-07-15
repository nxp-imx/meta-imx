require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "879b7aa95fa7b2d9fbe33efa0fd3941e"
SRC_URI[aarch64.sha256sum] = "d68d9239e87a6915c443966e4a94e719d1304a6a71f35d836cdcfab4cd9108b0"
SRC_URI[arm.md5sum] = "e24e9f8dc5c9b41079d37c3e698ad709"
SRC_URI[arm.sha256sum] = "a21df2759f19260b66d3a51ff6dd170bba4ce1faf3636aa9a4eb16f3dd73336c"
