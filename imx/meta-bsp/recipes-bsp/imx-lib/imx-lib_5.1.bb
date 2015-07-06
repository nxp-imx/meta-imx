# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "d504131b9bc3d3fb798d4ee8718d6eaf"
SRC_URI[sha256sum] = "2b4547ffb1de328cf8997a09a423c6f015d808493efd11a98a5d42c6497e3445"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
