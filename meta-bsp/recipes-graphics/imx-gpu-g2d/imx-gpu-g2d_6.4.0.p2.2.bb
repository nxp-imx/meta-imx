require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b28ee8780a2ade71e198efd677e1d754"
SRC_URI[aarch64.sha256sum] = "ab4d094d0f2204fca38480cdf15381611ada4b57849fac04f5f9ffe25e907ee8"
SRC_URI[arm.md5sum] = "2e646aa5e5c50fb0579523f28571c7df"
SRC_URI[arm.sha256sum] = "07d45bd4559056a86a27e64a8bbe9064f89c076e9643af76b6866bce3bba78bf"
