# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

SRC_URI[md5sum] = "1d555e91bdf31239fd0805844babde00"
SRC_URI[sha256sum] = "4189a506cda7527bee28d5445cda64c956f37b133c17a3679802c81b3b4c32bf"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7   = "IMX7"
