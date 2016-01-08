# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "df106d236d8df4ff0e230fe9e018e3f4"
SRC_URI[sha256sum] = "e1f807eaf3f55c00730496057a2eb827f2b984eef177a4788a4e4affbf18e95d"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
