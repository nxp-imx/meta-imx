require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "25d316da87ad9dac2a9d6712b62a2437"
SRC_URI[aarch64.sha256sum] = "29d90dad6dcfc4e450b27f2bbd3327288dc50efa43cfba2bae4826c3b1344db3"
SRC_URI[arm.md5sum] = "a0554f0f4bd33e0fd87e0aaaa94bcbb5"
SRC_URI[arm.sha256sum] = "a0897a0c1f3890afb50a6744ddf6d93099023344ab646e546fb4e1dc2348b17b"
