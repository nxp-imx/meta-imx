# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

PE = "1"

SRC_URI[md5sum] = "b9675196efd9244b1ea1cfe0f070a6e6"
SRC_URI[sha256sum] = "31d7d8d0024ff37d26232b01da9b4328ba62c3baf99466c578e893f921d205ec"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7   = "IMX7"
