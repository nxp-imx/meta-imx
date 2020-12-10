require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "4d0635f3015bf0689770d34b6467ce18"
SRC_URI[aarch64.sha256sum] = "d76b5bbd770c86d7460d95922c1ea2c3fbdad6d7dceb125227076d21e9d3bf46"
SRC_URI[arm.md5sum] = "50995cd1123477ac960d3d876ab0c579"
SRC_URI[arm.sha256sum] = "664d088c0bba00bed3da89fa5b9bdc3763f8d24b6a8015241128a658a83463fb"
