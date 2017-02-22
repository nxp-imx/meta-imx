# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx6sll += "imx-vpu"
DEPENDS_mx7d  += "imx-vpu"
DEPENDS_mx7ulp  = "virtual/kernel imx-lib imx-vpu"
PLATFORM_mx6sll = "IMX6SL"
PLATFORM_mx7ulp  = "IMX7D"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "f6955e4ff380e9a1d80d5e03bbd26920"
SRC_URI[sha256sum] = "9e32cb6d44a21375deafeb59de0b92cf50da827049836eb627b16ade0b7d4bc7"

COMPATIBLE_MACHINE = "(mx6|mx7)"
