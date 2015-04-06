# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "5786b3dc05239d3fff8b1bbb5229319e"
SRC_URI[sha256sum] = "ddfa0aacd6c26e7a31b1f09154bc0ccee18ef88dda3060917397cd414f09b154"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7)"

PLATFORM_mx7 = "IMX7D"
