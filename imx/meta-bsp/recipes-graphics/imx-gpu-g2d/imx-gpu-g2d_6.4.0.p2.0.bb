require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "515bbce34c4573cd76f87d7e2d634b05"
SRC_URI[aarch64.sha256sum] = "892dcfb5fb2613cc5e66e2a8afb8842fdb6b81ef82593c5d733b5340c53476ec"
SRC_URI[arm.md5sum] = "e471881ab927eef15ba59c0920844c70"
SRC_URI[arm.sha256sum] = "03d6b18bc15bb2fbaf4c41d0c096b626fd1f057ccfcb5abd1d156e17c065f08f"
