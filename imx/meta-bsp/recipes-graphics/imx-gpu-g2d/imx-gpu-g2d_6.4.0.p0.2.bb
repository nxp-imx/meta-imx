require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "fa8ca2f253633a13406d33d7dc05b689"
SRC_URI[aarch64.sha256sum] = "e08f7d198e84bb2d7cbea48e04bc9b5f0a26231e782ec113b51160b4aa276042"
SRC_URI[arm.md5sum] = "a0554f0f4bd33e0fd87e0aaaa94bcbb5"
SRC_URI[arm.sha256sum] = "a0897a0c1f3890afb50a6744ddf6d93099023344ab646e546fb4e1dc2348b17b"
