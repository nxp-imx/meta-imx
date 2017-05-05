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

SRC_URI[md5sum] = "83f34c29d6b09c21a78bba3e7f9550f1"
SRC_URI[sha256sum] = "e0e53c8e988772ced1f9725486b9b09b92fc34052996d964fd927db1ab08d1c5"

COMPATIBLE_MACHINE = "(mx6|mx7)"
