require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a8470cc5080c43e195f1803b39cb8b3f"
SRC_URI[aarch64.sha256sum] = "2c817005df4ca1d7e46640ecf4a9c636d1e2ebdc1ee7dd4daf01682cd278fe27"
SRC_URI[arm.md5sum] = "1fdbc0927c2bcbd724a6a833dfe50260"
SRC_URI[arm.sha256sum] = "0c6c8b5f8d0cb5768915c75a81f1dec456189d92fc7aeb90fe5f8a36a3b74163"
