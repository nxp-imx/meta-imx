# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

PE = "1"

SRC_URI[md5sum] = "c33d5a1a1b33e355d7df1049484a7346"
SRC_URI[sha256sum] = "46022817d25f154b60247fdcbb87216e23e553bd88ec9664b1b5d5911e7aa2a2"
PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
