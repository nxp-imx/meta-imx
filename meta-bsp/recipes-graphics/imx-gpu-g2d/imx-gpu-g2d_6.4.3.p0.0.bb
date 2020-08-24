require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "dc7ed46c07573c3223ec748c09b73c41"
SRC_URI[aarch64.sha256sum] = "c7f7fc55b40f6a182b10ae5e0900fb0a5e6c9d99338f50521e18562031ef8dac"
SRC_URI[arm.md5sum] = "99c50264db1d95ec48d935f608fd915e"
SRC_URI[arm.sha256sum] = "9f6bb1f07cdec08e803a6ca8aec000da8eb169ae8ec6931e44c8ccf65031fe9c"
