# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "25cad3867292e521c79f105f597b4542"
SRC_URI[sha256sum] = "8d8d4dadcad011d67e17edbff2b137486f4e722cb1763488c805dabea6e38c99"

COMPATIBLE_MACHINE = "(mx6|mx7|imx6ul)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
