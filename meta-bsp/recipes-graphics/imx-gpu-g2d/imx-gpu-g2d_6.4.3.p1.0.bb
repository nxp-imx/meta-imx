require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7bc76a1811d4c096f5ec402131f88a2d"
SRC_URI[aarch64.sha256sum] = "6e8bcbb3eeddd9fcddd449740c395f06d16245c1ad9440663453570fd05a896c"
SRC_URI[arm.md5sum] = "b57e6bdb550fb905bab7563a8426a0d9"
SRC_URI[arm.sha256sum] = "5f7e814c57b29bcbcb7106c2a75fbda2dbf6f5c4312a2b7505cf44de14e31805"
