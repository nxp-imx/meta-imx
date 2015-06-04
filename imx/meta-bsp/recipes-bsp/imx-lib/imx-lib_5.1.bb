# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "f9369c40e9186987c0b21f5afef0c26d"
SRC_URI[sha256sum] = "7f05afe3257383f487a9f10db3a8a0bf98bad0119683dbc201a3352ede73b054"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
