require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "993e6c1fec51d9aca12238f9f86a509d"
SRC_URI[aarch64.sha256sum] = "a2e140bfbdf582070d42b6a8ad7b2e233497ca192a686d20685a5216e1050b45"
SRC_URI[arm.md5sum] = "188349f4861976c8768ad6caf3496482"
SRC_URI[arm.sha256sum] = "0f2d31f3d79b4a9c23e7c6aa7089bca12168e20c923de8f90eef19fdddd43f3d"
