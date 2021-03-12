require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "27f211878fb0cb9dd5073fd0689a83ac"
SRC_URI[aarch64.sha256sum] = "1e300ea145da3458f416e4429d5f2d2fe4d600bf3740f2eb5f8ae662daed2da9"
SRC_URI[arm.md5sum] = "1fdbc0927c2bcbd724a6a833dfe50260"
SRC_URI[arm.sha256sum] = "0c6c8b5f8d0cb5768915c75a81f1dec456189d92fc7aeb90fe5f8a36a3b74163"
