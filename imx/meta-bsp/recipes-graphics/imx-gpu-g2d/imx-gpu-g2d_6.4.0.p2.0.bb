require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "62d0a03cf5d736827b1f9287a15384ca"
SRC_URI[aarch64.sha256sum] = "de7f9683e2d93b42f999919cceb67998bbe4abac816438c593c257ad23ca314d"
SRC_URI[arm.md5sum] = "c7f1d7534a0a971d5fe5fe05c21d711f"
SRC_URI[arm.sha256sum] = "5aefa10c4e92c05a54911a05174a4fbca00779dd2f009fc3c050315508527267"
