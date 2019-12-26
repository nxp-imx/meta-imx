require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "1c396e0eca9ecf11aeb0100c5e35d7c5"
SRC_URI[aarch64.sha256sum] = "4a2674db2dc02579ae2aa98230b2012f30f69f023c5af421d9f7c4bf596ec265"
SRC_URI[arm.md5sum] = "cc7e7ff7810f48e8eae10d63bac3e04f"
SRC_URI[arm.sha256sum] = "8ac798b12410b8fb0a4a3d2d793f1c11091bb5650f6b49be720c7bf2558baa3c"
