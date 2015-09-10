# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "cb0396f60350a60b20e9b441cf5a0830"
SRC_URI[sha256sum] = "7b25c8e94a38d9f45643ee9fa7c75e071747451e7cf24ca71d66d43bdb604cdb"

PLATFORM_mx7 = "IMX7D"
PLATFORM_mx6ul = "IMX6UL"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7|imx6ul)"
