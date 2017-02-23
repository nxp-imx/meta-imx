# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "7668083331d9026ff2aff193cb2dfa85"
SRC_URI[sha256sum] = "1a24ad0ab0e8020f86689e40ad7b9d38bde6aad6109418dad7177c79b8fddde9"

COMPATIBLE_MACHINE = "(mx6|mx7)"

# add this until imx-lib makefile is changed to exclude 6SLL
PLATFORM_mx6sll = "IMX6UL"
PLATFORM_mx7ulp = "IMX7"
