# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "0e2001779d7ec3476d9e01a5576619eb"
SRC_URI[sha256sum] = "5ab5ff537e6c3d352ac2f04717e3d569da5c9c433260be5ec0c8c478a12947aa"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7 = "IMX7"
PLATFORM_mx6ul = "IMX6UL"
