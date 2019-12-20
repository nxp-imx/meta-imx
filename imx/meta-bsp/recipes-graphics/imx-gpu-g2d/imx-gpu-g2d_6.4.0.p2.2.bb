require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "723c9fa1dbed87176aa4818dfc95eef1"
SRC_URI[aarch64.sha256sum] = "321e337211dcf7d50210b13700add910b1d0924f462a4d9957d7d4e52bdc45de"
SRC_URI[arm.md5sum] = "aa8d49374990e4b78f86037f4bfd4efd"
SRC_URI[arm.sha256sum] = "08da93523c67938f646994f534e2bf758cfcf73f618d99313650dfab8b7513ea"
