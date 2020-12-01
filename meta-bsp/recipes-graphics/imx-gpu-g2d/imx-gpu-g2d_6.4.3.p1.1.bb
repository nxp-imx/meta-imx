require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "0659b9482f2a1da27271e83795338498"
SRC_URI[aarch64.sha256sum] = "9725b14aa5b47322d7381a4dd71d27cc80e8e361ac3acaf1cf29e4431b89caef"
SRC_URI[arm.md5sum] = "639679f12f42ddff3802efed981791e0"
SRC_URI[arm.sha256sum] = "addb9a83f2a37c45f3779ac8a2b05a472086500c57e5c54190f1d3d77e48c70e"
