# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "46d7dbd5811e0a39bf325e8de5d543ae"
SRC_URI[sha256sum] = "ae71fdaf31c8caf4c19ea5e7690af9798859beb260309ff1a717574a55e4d258"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7)"

PLATFORM_mx7 = "IMX7D"
PLATFORM_mx6ul = "IMX7D"
