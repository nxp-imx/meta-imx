require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2e3e654a22a1158589a7426e1abb714c"
SRC_URI[aarch64.sha256sum] = "23d22c706d870b09c840697aba81a1b2bd9af1aea6a045c4f7b9fb66b51c857c"
SRC_URI[arm.md5sum] = "f613697246de6692773958425484942b"
SRC_URI[arm.sha256sum] = "92274cd40fbb529649f63c0d9f635f7d6b104ed00a408f84901995372647fef0"
