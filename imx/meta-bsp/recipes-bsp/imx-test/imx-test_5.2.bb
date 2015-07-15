# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "f584356547ab7f67eddf370c80867b78"
SRC_URI[sha256sum] = "2e1cef993f3ea3fefc8a7920ee1f28332295904568a95d136303340aba729ea6"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7)"

PLATFORM_mx7 = "IMX7D"
PLATFORM_mx6ul = "IMX6UL"
