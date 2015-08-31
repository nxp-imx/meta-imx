# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "38744ca0f85fb1ae8346ab9ac2030e54"
SRC_URI[sha256sum] = "22ffd80b445467e53758f3e1fd20556f8da9675a4c04ec59dcb6aee636e7f931"

PLATFORM_mx7 = "IMX7D"
PLATFORM_mx6ul = "IMX6UL"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7)"
