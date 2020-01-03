require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e81eab645f51eb965a451077b41a477a"
SRC_URI[aarch64.sha256sum] = "aaa11df8d69cf7bd96a41953ef756017de4224cf0e7f9fc8ce7e28958da5ead4"
SRC_URI[arm.md5sum] = "ffea42a29aa59ba2ef2fd2ff36948bfc"
SRC_URI[arm.sha256sum] = "1ef1ded2189dde3c68e6ae4d38066c5ad69d6126e237e2680779f1bad77b5e8a"
