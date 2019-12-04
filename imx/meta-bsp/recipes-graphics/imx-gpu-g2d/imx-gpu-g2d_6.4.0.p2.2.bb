require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "4cf828e1558f0eecdaeb7d9985d82948"
SRC_URI[aarch64.sha256sum] = "87561036c5db9b15dbf2933d0a2849525b53b7d945cb103acb0f076608c61fd3"
SRC_URI[arm.md5sum] = "5650c9c6c962a83c236d4b36ec4542db"
SRC_URI[arm.sha256sum] = "d4f4d052d5a815fff5f93e4144acd39de806377c78237455b1534d5760606c0d"
