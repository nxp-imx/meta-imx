# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "virtual/libvpu"
DEPENDS_mx6sx += "virtual/libvpu"
DEPENDS_mx6ul += "virtual/libvpu"
DEPENDS_mx6sll += "virtual/libvpu"
DEPENDS_mx7d  += "virtual/libvpu"
DEPENDS_mx7ulp  = "virtual/kernel imx-lib virtual/libvpu"
PLATFORM_mx6sll = "IMX6SL"
PLATFORM_mx7ulp  = "IMX7D"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "bd98f0c4e30f7c7c9e669991877c3132"
SRC_URI[sha256sum] = "b427cb32a9668b873f2d0357beae0a374c1ee20b33d8bdc9e255840770ee7a96"

COMPATIBLE_MACHINE = "(mx6|mx7)"
