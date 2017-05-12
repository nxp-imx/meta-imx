# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=6b552f505eedab4a11ab538cf3db743a"

PE = "1"

SRC_URI[md5sum] = "702eb3c6004be0da19414d5da0e0ae47"
SRC_URI[sha256sum] = "6b56ce09b96c5dd509865faafa2cb65df08de808640c3e62ae090e89f1aceb36"

# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"
PLATFORM_mx6sll = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx7)"
