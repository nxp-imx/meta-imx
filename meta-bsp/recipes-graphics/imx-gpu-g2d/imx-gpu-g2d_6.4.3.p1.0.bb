require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "49acee51a0dd154c3da408164afc35af"
SRC_URI[aarch64.sha256sum] = "72df83fb349be9aa4368cc2ae7c7f67c3cfe7065241142a6cb7f37a558456f79"
SRC_URI[arm.md5sum] = "d2f269ad714d2bc400d39ceae796086e"
SRC_URI[arm.sha256sum] = "d2fd5a10d6a0e8dbb6b80bb56528fa882d8f6df5bef9297bd999ea6421daedaf"
