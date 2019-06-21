require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f486815713a4412a42ac51926cbbbd79"
SRC_URI[aarch64.sha256sum] = "215672ac31d389ba0c74d16957ab23a78354c3a4d4c80e9ea3bb6be108ab39a4"
SRC_URI[arm.md5sum] = "d525fc71fd502398e4198cb6e63f03db"
SRC_URI[arm.sha256sum] = "5531ff9961da5364808078d0e59930f35f1d589a8cc67e84f9a446a8a34e32f1"
