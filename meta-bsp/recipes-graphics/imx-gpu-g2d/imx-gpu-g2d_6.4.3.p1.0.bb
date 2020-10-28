require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "670fadc040eb8b2d483a96d35d9dd749"
SRC_URI[aarch64.sha256sum] = "10a44b3fe4bbc66816f31fec7088eba95fb7d17367960712745674b063625e59"
SRC_URI[arm.md5sum] = "1aaab41688712d2d655a9558f8a3e8a8"
SRC_URI[arm.sha256sum] = "f9fe2ebeb495bd1ba71229892c6bcb2f850afef318011133e91c4eef8f42036e"
