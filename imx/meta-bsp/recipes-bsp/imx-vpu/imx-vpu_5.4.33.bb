# Copyright (C) 2013-2016 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=8cf95184c220e247b9917e7244124c5a"

PE = "1"

SRC_URI[md5sum] = "6f97edcf76a56c7d37cb9bdcf4ee3926"
SRC_URI[sha256sum] = "2c92aae7283e252d18ef7751b13d490a008610a55436e42b8627dff1532dd1a2"

# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
