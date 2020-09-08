require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "3d94c8257c00c734298228e2d4185ca9"
SRC_URI[aarch64.sha256sum] = "a092faac3fb01882579ef5960c3706a3e5c4a18890b63c4791f2cfe634540d66"
SRC_URI[arm.md5sum] = "d950dee71df13fd6afecb020b0e14e77"
SRC_URI[arm.sha256sum] = "8a8a93e40bb2b0ab3084f95d966338fa4ed8c634f2babd028e1c7a7fd97ef9e8"
