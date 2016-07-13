# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "ff1136608fed60b642c2558cc6275fb3"
SRC_URI[sha256sum] = "1c986dbfa6a0e1e418e52d9845c61638d2ade7752d6911361c4123d976f2cc7b"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
