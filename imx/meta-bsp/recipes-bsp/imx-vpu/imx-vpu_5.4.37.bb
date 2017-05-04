# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=be67a88e9e6c841043b005ad7bcf8309"

PE = "1"

SRC_URI[md5sum] = "46fd44e75134daea800bf324c7920acf"
SRC_URI[sha256sum] = "a5a9e01e1305528dffaa9240dde3e4513e152b3e6f3761634bf52eeac5696291"

# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"
PLATFORM_mx6sll = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx7)"
