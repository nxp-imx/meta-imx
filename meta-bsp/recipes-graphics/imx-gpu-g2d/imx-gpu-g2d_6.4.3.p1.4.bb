require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a8470cc5080c43e195f1803b39cb8b3f"
SRC_URI[aarch64.sha256sum] = "2c817005df4ca1d7e46640ecf4a9c636d1e2ebdc1ee7dd4daf01682cd278fe27"
SRC_URI[arm.md5sum] = "a30eb1617ecf19e4ec23e5c253473e19"
SRC_URI[arm.sha256sum] = "1119dc0c2f0423ae4eb44c7dbdc87fe2c9ac95fd49e63ef2abba42396786e6bf"
