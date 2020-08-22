require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5a5edafbcf28010ca8b9cf7cbd4780b3"
SRC_URI[aarch64.sha256sum] = "d572e7e558999dce589abf0614e8dbf61b13e0c1d692285ac865c14ff489a9fa"
SRC_URI[arm.md5sum] = "4ba4db2a8e306c0b2e0d6706fb202aea"
SRC_URI[arm.sha256sum] = "218dd59f42df0822a5c7564e40c46340f3c289dbd236a2838d52dcfd30966d8e"
