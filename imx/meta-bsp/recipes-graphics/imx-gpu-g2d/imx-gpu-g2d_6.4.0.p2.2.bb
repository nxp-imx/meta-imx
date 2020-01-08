require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a0ce4f12a734b6e0a20ee3143e2ee664"
SRC_URI[aarch64.sha256sum] = "e43bb2fa4c0732cde7f16c0a212e2f0baa7a873252a871aa635c2e575a34f37c"
SRC_URI[arm.md5sum] = "50d820216d1bb865c105d27fa1c0e8f3"
SRC_URI[arm.sha256sum] = "6ac884e23d67860bdff6f7dcb1c3cb2dab1eb6b48591792927717a1692d131cf"
