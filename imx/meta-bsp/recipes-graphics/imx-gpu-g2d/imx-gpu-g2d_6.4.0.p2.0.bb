require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "62d0a03cf5d736827b1f9287a15384ca"
SRC_URI[aarch64.sha256sum] = "de7f9683e2d93b42f999919cceb67998bbe4abac816438c593c257ad23ca314d"
SRC_URI[arm.md5sum] = "5d56d19841f42082519b455db8d81718"
SRC_URI[arm.sha256sum] = "4a7d3731c296c11fa5bde18a24faafe8ad0685ebea6c3de68828453544ebf456"
