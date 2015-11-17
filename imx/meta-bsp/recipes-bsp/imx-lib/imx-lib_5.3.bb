# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "27dd9d3ca2585b4ac347fab62de5f8f5"
SRC_URI[sha256sum] = "c90e2152a58747ebecc9a069a142c76653ed64f207c38b1c38e199203029577a"

COMPATIBLE_MACHINE = "(mx6|mx7|imx6ul)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
