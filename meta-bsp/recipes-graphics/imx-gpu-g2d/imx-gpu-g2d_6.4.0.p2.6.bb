require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "52c92dfcb6646cdc653910932bc1cf00"
SRC_URI[aarch64.sha256sum] = "0a62fe55e6d7bf06aa776c1256d6ac7d65d0e2011ff98661a7ef1f5ae2823ffd"
SRC_URI[arm.md5sum] = "a0eefeb07c3ec2e38365e1064e87ea88"
SRC_URI[arm.sha256sum] = "18939d2e18176bd36b73a35b6486c047567a3d6f7e89ff247de1c9ec3983f6c3"
