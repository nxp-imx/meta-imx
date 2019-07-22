require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2c5b31147e459bf7d8e313ed4f8d81ba"
SRC_URI[aarch64.sha256sum] = "05117f5f473ed449eb1fa6ed6c19a4f0349778115adee659dd1115d5c4d5c122"
SRC_URI[arm.md5sum] = "0a771f8ddda3fb16bea612ce144df734"
SRC_URI[arm.sha256sum] = "a0904d6381bd2f1259412e36d7610d5c41df2f346148cbdd6b9aefe49f4ccfc4"
