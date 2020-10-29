require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f0164714d601141afb20385d0b6259e7"
SRC_URI[aarch64.sha256sum] = "ff14c3537a4879c4f4a43b77ed7cf14f5cd895382e5cf98cc0aff32ec8566c03"
SRC_URI[arm.md5sum] = "7998bb62ca1d35685c05807b05276b74"
SRC_URI[arm.sha256sum] = "1550c0161477e7c8e21835d09c01d95ba8c5eb2b4e3b48cdabae34fdd7fda8f4"
