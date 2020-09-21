require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2a60a4168b2919941138fb00ea90ec76"
SRC_URI[aarch64.sha256sum] = "d3d03b7a16ca26eedab6a28d1f87e3876f9e75b79eb566a1b248292e4683b324"
SRC_URI[arm.md5sum] = "c3e5b4c5a4205503225b7d6cfbd544fc"
SRC_URI[arm.sha256sum] = "068f983a6007ebe8c3186bf3a268d3db313e95b0aa2e9824c354794de66dc237"
