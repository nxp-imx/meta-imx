require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "441caff89c07ac01f035695e11dd5328"
SRC_URI[aarch64.sha256sum] = "267c114a7812782e73fd1779418f378dd528258d967f3ffa46fc9d4d3d13d83a"
SRC_URI[arm.md5sum] = "079561a17dff5d8895a6be1da234c8a9"
SRC_URI[arm.sha256sum] = "b2e1ac10feceae9f225eda58bf2423575b936ae7445e229d4324234c5b072442"
