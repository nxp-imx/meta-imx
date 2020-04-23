require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "c5fe6d1c3b2684e8096314b9ca5815b5"
SRC_URI[aarch64.sha256sum] = "f8a9b1fd63fcb78aab89a010a99d3aa423bed742a4550dced68208f8795c553c"
SRC_URI[arm.md5sum] = "b4b3113853f76581a0ddaadcd8f38657"
SRC_URI[arm.sha256sum] = "43af72bb478be6d0aaccd9eaac934cf7fd59aed85bf1e2a1b682574262d58f31"
