# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "269d4fcd789f0716cfe815d05e4cfd59"
SRC_URI[sha256sum] = "a71d37385328d971788b3bb0e25ed3c0047a62f938c6cb268661934a91323a58"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7)"

PLATFORM_mx7 = "IMX7D"
PLATFORM_mx6ul = "IMX6UL"
