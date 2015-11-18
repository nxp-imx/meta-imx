# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "fbedd002908506a28051c958c0c4a611"
SRC_URI[sha256sum] = "0fdecbc9216940b46dd3d146add588cbdce2e626777043baa48026d1c3a004f0"

COMPATIBLE_MACHINE = "(mx6|mx7|imx6ul)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
