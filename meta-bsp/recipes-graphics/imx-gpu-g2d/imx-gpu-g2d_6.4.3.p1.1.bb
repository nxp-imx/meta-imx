require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "8b6cbd5004a05917339b1116e1388696"
SRC_URI[aarch64.sha256sum] = "4484f1760b2ee7d13e421efe46c18dcbb1ce7f12ea60ca4022cb7e3a6a2e989a"
SRC_URI[arm.md5sum] = "36fc174d9847450de643209aae68194d"
SRC_URI[arm.sha256sum] = "b9986be92368b0c9701f26286594d3735511d53dd5231bd32355af7e22cefcf6"
