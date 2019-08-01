require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "14bd5d7e178ba5d2395be6f212431c4d"
SRC_URI[aarch64.sha256sum] = "f553c6b469a5a6d2a315ab2e9a810e9957846674ea758daaa0c988f3ea306967"
SRC_URI[arm.md5sum] = "d3fa6ce5061b3d41acabc0147bdcebbe"
SRC_URI[arm.sha256sum] = "7e6cfe0e69b9193637bbe7b4607648f89e73195355ae8e2f303adf7b06c92faa"
