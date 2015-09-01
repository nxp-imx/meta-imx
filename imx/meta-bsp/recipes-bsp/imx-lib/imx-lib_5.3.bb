# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "8ed3b96a401e2f03ebe87e59a861f2e9"
SRC_URI[sha256sum] = "027e22c635e38c7fb093248c1c8a6b2c89f72019a662a178484b0ba5c17d3009"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
