require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8b6cbd5004a05917339b1116e1388696"
SRC_URI[aarch64.sha256sum] = "4484f1760b2ee7d13e421efe46c18dcbb1ce7f12ea60ca4022cb7e3a6a2e989a"
SRC_URI[arm.md5sum] = "d69a53ed20978dbbe28a183e6f60158b"
SRC_URI[arm.sha256sum] = "3cadfd27a0876c04672c575f31dfbea5db70fadf391d355a3bb1652b6b3e53f9"
