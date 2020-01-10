require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "01edba53fdbefa93d07f8268eb397316"
SRC_URI[aarch64.sha256sum] = "eb27d7caf0223b288272fe9dde7acc79fb363b634acec8752707ed58a4e053c6"
SRC_URI[arm.md5sum] = "8b2fe5610cba4e42a2e534ee0e21b94c"
SRC_URI[arm.sha256sum] = "a8937f932a4c9be3e7a226417ea5851096a0beb9211d6556f031dcfee0004a83"
