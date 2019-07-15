require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "879b7aa95fa7b2d9fbe33efa0fd3941e"
SRC_URI[aarch64.sha256sum] = "d68d9239e87a6915c443966e4a94e719d1304a6a71f35d836cdcfab4cd9108b0"
SRC_URI[arm.md5sum] = "4105e8a208ab455902445ca4bd2b34f4"
SRC_URI[arm.sha256sum] = "f469c946d5abc2469e7295f5a69aa61ce7940ce3b3604203c964c443c50dbf89"
