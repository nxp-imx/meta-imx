# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

PE = "1"

SRC_URI[md5sum] = "443801967faf4210a041b0c447d7bcbb"
SRC_URI[sha256sum] = "275f54983f209bcf133fa551177efb19cd0523808ae09662ed7a5e7b3113a7b9"
PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
