# Copyright (C) 2013-2016 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=a31dce3023402a821cfcdc1bb8dbdbc0"

PE = "1"

SRC_URI[md5sum] = "9319ad2eda8c5fc658e6496888e36606"
SRC_URI[sha256sum] = "7688f8592a4f60e76350d3e0f173ee22f280833249d082f59da6136aa4ef4771"

# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
