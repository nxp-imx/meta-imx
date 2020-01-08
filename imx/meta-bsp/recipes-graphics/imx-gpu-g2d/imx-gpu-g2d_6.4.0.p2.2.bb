require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "86d07a857505ac28f872d496412fdec2"
SRC_URI[aarch64.sha256sum] = "2ad69850260f187ac8937687a7bd1504cbfd6ce1c89737381b2920096fafe0ac"
SRC_URI[arm.md5sum] = "d0eba2f0a0bedd5c0e1c41c11a8e1779"
SRC_URI[arm.sha256sum] = "9f56fccd58f0d6e61544cb118c6b6f89fac9ef241ccf1f61fa6bcc1918764d55"
