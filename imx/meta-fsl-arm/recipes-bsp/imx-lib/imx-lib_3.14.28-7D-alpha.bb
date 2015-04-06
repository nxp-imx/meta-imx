# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

LIC_FILES_CHKSUM = "file://COPYING-LGPL-2.13;md5=fbc093901857fcd118f065f900982c24"

PE = "1"

SRC_URI[md5sum] = "01cf31516eb26bf94d3dfb95bc885958"
SRC_URI[sha256sum] = "e66382b6dbd9b6ab8fcba0a87ee2c2739aa7c74559ba8bc810b9144af07a140e"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7   = "IMX7"
