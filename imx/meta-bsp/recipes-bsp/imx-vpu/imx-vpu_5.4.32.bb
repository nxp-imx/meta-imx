# Copyright (C) 2013-2015 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=3880bb9c943b135a30fad5e8aabd3ee9"

PE = "1"

SRC_URI[md5sum] = "0b35ade1d110838d37abdcf337c7c894"
SRC_URI[sha256sum] = "106170285e1fb6898b7d581f8639e335d542a0c32e5f90df2509548671f152cd"



# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
