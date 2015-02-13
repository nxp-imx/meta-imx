# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

PE = "1"

SRC_URI[md5sum] = "d9b338547f7a8528876fa83d6230bdeb"
SRC_URI[sha256sum] = "3fb4b4e83de71e4d24c2f2985c92484a2b27fe6c517cb5b265bf7ddc473ba5d3"
PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
