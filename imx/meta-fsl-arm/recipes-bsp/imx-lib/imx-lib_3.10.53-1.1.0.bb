# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

PE = "1"

SRC_URI[md5sum] = "c510512ebd2bae5a7e57079b9788960e"
SRC_URI[sha256sum] = "4db2c1f286f2478b8236e62de4df9d2a2c26ff727c752dc4f21e2910f4a5e5d7"
PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
