# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "3ed4baaa5b2689eec3406b94e0bc6b60"
SRC_URI[sha256sum] = "7149467f0873ed13041f88ba49197b94b645ef1085e27f6862afd82e469f46da"

COMPATIBLE_MACHINE = "(mx6|mx7|imx6ul)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
