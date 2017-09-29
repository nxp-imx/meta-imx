# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=6b552f505eedab4a11ab538cf3db743a"

PE = "1"

SRC_URI[md5sum] = "2b8311cb6e5b5813253db706e807d962"
SRC_URI[sha256sum] = "ee265e88d17c7369bd9cb917e7cce035b8c7ee2ba4491645fdab9f382f54beb0"

# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"
PLATFORM_mx6sll = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx7)"
