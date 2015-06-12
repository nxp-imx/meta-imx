# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "1e14410c02f1f606b797e71015d15c24"
SRC_URI[sha256sum] = "3af7dbeca292fdd3b3c31f7b7839873ca0f13ef0d356c6839efdcd858edf4fa5"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
