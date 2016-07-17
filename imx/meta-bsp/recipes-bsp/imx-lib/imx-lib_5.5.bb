# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "9a52dfee2a1950ef1d083392c579a0a6"
SRC_URI[sha256sum] = "123206a227973f91b6c733e343587e4f47734db4f2b2c4ea9db3800742d2b595"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
