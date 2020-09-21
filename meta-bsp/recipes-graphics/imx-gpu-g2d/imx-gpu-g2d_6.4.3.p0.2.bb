require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "26a5bf2bbd91015aed5258926f5446a8"
SRC_URI[aarch64.sha256sum] = "55ae4111b1c4a4355b6d7653be0a59b15adeae2f9094decafc10b2e2ab0d4d88"
SRC_URI[arm.md5sum] = "c3e5b4c5a4205503225b7d6cfbd544fc"
SRC_URI[arm.sha256sum] = "068f983a6007ebe8c3186bf3a268d3db313e95b0aa2e9824c354794de66dc237"
