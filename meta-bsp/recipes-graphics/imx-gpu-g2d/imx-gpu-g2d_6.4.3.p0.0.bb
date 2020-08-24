require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e902f509b1f96a907e82e163b4917d49"
SRC_URI[aarch64.sha256sum] = "522ad101ba16d7b838f0d97cf21dbe26fa7ce85562061b9346afa38f2edb67eb"
SRC_URI[arm.md5sum] = "99c50264db1d95ec48d935f608fd915e"
SRC_URI[arm.sha256sum] = "9f6bb1f07cdec08e803a6ca8aec000da8eb169ae8ec6931e44c8ccf65031fe9c"
