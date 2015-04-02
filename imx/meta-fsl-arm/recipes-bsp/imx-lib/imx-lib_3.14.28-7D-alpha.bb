# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

PE = "1"

SRC_URI[md5sum] = "5a439c27caa5d772ecac955654ccc2f3"
SRC_URI[sha256sum] = "e8991fba9eb30b80ac5eb6536ac0d6a671cf8ef1129d0ed78e4a32b37b88b656"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7   = "IMX7"
