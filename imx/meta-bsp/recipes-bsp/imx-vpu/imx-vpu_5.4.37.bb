# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=6b552f505eedab4a11ab538cf3db743a"

PE = "1"

SRC_URI[md5sum] = "01a73ce199ba20cf005bcf3fbff28a12"
SRC_URI[sha256sum] = "47f82412278d117bd989efd95718cbd11b9310093bc37506bb01d5b70d4e8c8a"

# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"
PLATFORM_mx6sll = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx7)"
