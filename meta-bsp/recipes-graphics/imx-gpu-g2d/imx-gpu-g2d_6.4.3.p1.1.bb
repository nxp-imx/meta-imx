require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "50ecfc74e210b90cb932e9076e00dd45"
SRC_URI[aarch64.sha256sum] = "83e79e982f84742fc67c7bcca0bd00b2d3166b5ec2dc7751625469749e771627"
SRC_URI[arm.md5sum] = "050f21fb110bd3f32ae1d11ec7b94e8a"
SRC_URI[arm.sha256sum] = "155356d9282309413712c0ddb45023cd2b1404e5ff540078128f2d37cd4a00e2"
