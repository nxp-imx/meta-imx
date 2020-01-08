require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a0ce4f12a734b6e0a20ee3143e2ee664"
SRC_URI[aarch64.sha256sum] = "e43bb2fa4c0732cde7f16c0a212e2f0baa7a873252a871aa635c2e575a34f37c"
SRC_URI[arm.md5sum] = "d0eba2f0a0bedd5c0e1c41c11a8e1779"
SRC_URI[arm.sha256sum] = "9f56fccd58f0d6e61544cb118c6b6f89fac9ef241ccf1f61fa6bcc1918764d55"
