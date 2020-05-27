require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "0183b81aea3213c6cdf09074cb1d0b01"
SRC_URI[aarch64.sha256sum] = "520dcbc1efc415d8bb85b464f6928a7a935e3e7f801e72489e28ccf7aae02bd4"
SRC_URI[arm.md5sum] = "a1924633255e630663beaab4b1cedbb4"
SRC_URI[arm.sha256sum] = "5c30bf1021f929f710fd3383643b75a303ffe0a1033db1e08deb199431d9760f"
