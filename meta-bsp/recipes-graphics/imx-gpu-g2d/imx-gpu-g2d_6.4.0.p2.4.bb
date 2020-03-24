require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "aca06dd7522ef0bcf3ddf8426f802008"
SRC_URI[aarch64.sha256sum] = "54f89155e52ad2ee4e0eb6711524d846ff016c0bf452ae268f0d226b91d15a46"
SRC_URI[arm.md5sum] = "4d2f7076783e729e12c69aaf63e2b7ec"
SRC_URI[arm.sha256sum] = "1a008aec8e9dd5a64b0795bbeb6c1f0e5f9688ad4ab7f1d5e4727f2ba238b2aa"
