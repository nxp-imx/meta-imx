require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "515bbce34c4573cd76f87d7e2d634b05"
SRC_URI[aarch64.sha256sum] = "892dcfb5fb2613cc5e66e2a8afb8842fdb6b81ef82593c5d733b5340c53476ec"
SRC_URI[arm.md5sum] = "93fd850738b5310a5f3d46d8d9c42546"
SRC_URI[arm.sha256sum] = "ffa34868e7593f3a203ef623c3363bb9a2dbb0620855b2b6b2f2fc13e9f77617"
