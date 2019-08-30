require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2639de602bb225e6b17a3344bdd1616d"
SRC_URI[aarch64.sha256sum] = "df4931a330ceb74350c55e39ca6e3e96edf148eba50e4d82b06cfb630d181262"
SRC_URI[arm.md5sum] = "42fdcc1078bd0356f34aee6231c4d0a6"
SRC_URI[arm.sha256sum] = "265862908ae83cd092cb0831214c7046e4e3a8b6f1860895ee657a8ba4c8bd5c"
