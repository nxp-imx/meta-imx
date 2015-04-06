# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

PE = "1"

SRC_URI[md5sum] = "d21e2334fb78dfcfea6c848ba1d30323"
SRC_URI[sha256sum] = "57989097edebb2406ae81493994d9c65f719b00e80c513c0f1fbaa4a6741d42b"

COMPATIBLE_MACHINE = "(mx6|mx7)"

PLATFORM_mx7   = "IMX7"
