# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "67b21dae3393c0b472c080c777bd2855"
SRC_URI[sha256sum] = "c2bade743a78724360a9fa8ac3f894d863d2bef5a5a4b6de9e2c399fa51f5efa"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7)"

PLATFORM_mx7 = "IMX7D"
