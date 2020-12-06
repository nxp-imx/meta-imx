require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d780ea578751670c01df9df2b191522b"
SRC_URI[aarch64.sha256sum] = "e2166f2eed3eb9cff5c32496cce5874658613d3f0aa3041941b9532313129927"
SRC_URI[arm.md5sum] = "d69a53ed20978dbbe28a183e6f60158b"
SRC_URI[arm.sha256sum] = "3cadfd27a0876c04672c575f31dfbea5db70fadf391d355a3bb1652b6b3e53f9"
