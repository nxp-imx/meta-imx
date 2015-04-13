# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI = "${FSL_MIRROR}/${PN}-3.14.28-7D-alpha.tar.gz"
S = "${WORKDIR}/${PN}-3.14.28-7D-alpha"

SRC_URI[md5sum] = "befaa5d3bc7e1f9d359a832cf81f2a8d"
SRC_URI[sha256sum] = "70012b440c75bdea5a25f75e18be999abb3b4879834e26d61ebef014708df2ac"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7   = "IMX7"
