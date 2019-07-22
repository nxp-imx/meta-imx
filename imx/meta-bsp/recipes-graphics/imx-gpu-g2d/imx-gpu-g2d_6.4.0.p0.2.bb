require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ccfe1e6c0075cfc6b6c4eb6224ea15e5"
SRC_URI[aarch64.sha256sum] = "90702dabb28a138df99f44bf0ad290762cf193d741334e45db320ff603df6ed7"
SRC_URI[arm.md5sum] = "0a771f8ddda3fb16bea612ce144df734"
SRC_URI[arm.sha256sum] = "a0904d6381bd2f1259412e36d7610d5c41df2f346148cbdd6b9aefe49f4ccfc4"
