# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "ccdd084de94cf70e11da6aeb6665cb0d"
SRC_URI[sha256sum] = "40161bb935d8280bb1cc4a70acc5abf210495479e07b5c15dcd16ede1362b1a6"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7)"

PLATFORM_mx7 = "IMX7D"
PLATFORM_mx6ul = "IMX6UL"
