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

SRC_URI[md5sum] = "af350d0f761dcf26d13f5a4303a60c66"
SRC_URI[sha256sum] = "6faf52ed58d93c6320c43fb2028e73804a59a3c8953462d8ae7b179415a68426"

COMPATIBLE_MACHINE = "(mx6|mx7)"
