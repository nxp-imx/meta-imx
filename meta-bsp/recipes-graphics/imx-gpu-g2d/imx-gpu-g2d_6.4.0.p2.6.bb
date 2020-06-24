require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ad22bc857541ce31ca9fd76b07f81af6"
SRC_URI[aarch64.sha256sum] = "2a322ee96ba0062015ac7ca51ba3f261a94ad5749c879886a9bf93af61febbad"
SRC_URI[arm.md5sum] = "abac20f823036cfaceea72f239a0c5e3"
SRC_URI[arm.sha256sum] = "a4a61ebce7e16e12382873eae3b05e42742cc2bc8e1c1f87c986d5e4b3009777"
