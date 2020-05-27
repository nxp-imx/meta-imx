require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b01c5c855693ce8ac571b2af423e1cbb"
SRC_URI[aarch64.sha256sum] = "5326417fd4d29c1b6c06f0b414a9fd1e2daf9936490fbc4d4bb7bf058be696a8"
SRC_URI[arm.md5sum] = "a1924633255e630663beaab4b1cedbb4"
SRC_URI[arm.sha256sum] = "5c30bf1021f929f710fd3383643b75a303ffe0a1033db1e08deb199431d9760f"
