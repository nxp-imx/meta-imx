require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ccfe1e6c0075cfc6b6c4eb6224ea15e5"
SRC_URI[aarch64.sha256sum] = "90702dabb28a138df99f44bf0ad290762cf193d741334e45db320ff603df6ed7"
SRC_URI[arm.md5sum] = "d4db0cc91cada1737653ddbf876bc444"
SRC_URI[arm.sha256sum] = "a39e749066bfca729925a7446e97510d202e939d0bfb0a0c81eac655ed6f69ce"
