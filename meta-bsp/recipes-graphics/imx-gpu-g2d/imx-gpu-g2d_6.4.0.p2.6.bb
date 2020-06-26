require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9b8acd86f38b02b5e604145fbebc179e"
SRC_URI[aarch64.sha256sum] = "f85c2c44a184e3efb3c7ed2cb9f3d9f80e00f9c5685bb7b703f07eee474ceb41"
SRC_URI[arm.md5sum] = "81b09996c17d030b3c865d9aac0c8270"
SRC_URI[arm.sha256sum] = "4a14b90f67cf4fab8537593692c1e236c23b50adbac79af1ca575205dc9491f2"
