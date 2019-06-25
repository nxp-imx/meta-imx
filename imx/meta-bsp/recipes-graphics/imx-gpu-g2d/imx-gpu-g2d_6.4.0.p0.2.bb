require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9413dad8e323d70e5415aff456af1724"
SRC_URI[aarch64.sha256sum] = "5c3d93c6617e82aa06a8642371abf84142e6b235d84a1916efe4dd23fbba8ee3"
SRC_URI[arm.md5sum] = "0178e087089395fa6766b7a8b8592c46"
SRC_URI[arm.sha256sum] = "befbc819381f546b808e762844e5ab6600498b95d132fc847978b3ec06210a3e"
