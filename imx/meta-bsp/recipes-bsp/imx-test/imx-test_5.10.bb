# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx6sll += "imx-vpu"
DEPENDS_mx7d  += "imx-vpu"
DEPENDS_mx7ulp  = "virtual/kernel imx-lib imx-vpu"
PLATFORM_mx7ulp  = "IMX7D"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "c5df9152eb7d443eeaa337494c2bdd11"
SRC_URI[sha256sum] = "7d2890314a9792774ea6c45f81043fe6e7b2327369eae5c726841303ab2a6b51"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
