require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b28ee8780a2ade71e198efd677e1d754"
SRC_URI[aarch64.sha256sum] = "ab4d094d0f2204fca38480cdf15381611ada4b57849fac04f5f9ffe25e907ee8"
SRC_URI[arm.md5sum] = "1acb7eafbae6310f22b53aab2356c78b"
SRC_URI[arm.sha256sum] = "b502f9da84212b290f15dba19b56547e7a9a2a7e17699a9e158e7b1d763832c2"
