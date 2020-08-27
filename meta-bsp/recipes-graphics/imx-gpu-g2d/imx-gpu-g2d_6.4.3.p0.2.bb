require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "144abdc6b660ade6f455962a815264d7"
SRC_URI[aarch64.sha256sum] = "5464f59c137b30d305179e457acee1ab8eacd06dbbf7402a0f5b8898a9010e6d"
SRC_URI[arm.md5sum] = "82e228a0adb3c52ad21961c18060b599"
SRC_URI[arm.sha256sum] = "f7ebd15402a74088ae344faf265ef2760bc5d95207643fdf103c812cda1e95c4"
