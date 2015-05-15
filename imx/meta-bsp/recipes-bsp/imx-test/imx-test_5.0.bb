# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "1e3131a59077e9e03fff25567f2b848b"
SRC_URI[sha256sum] = "4fa0bd0045d9febd1d718277abccfdb8039524f4bb36c16c3a49492b14679de8"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7)"

PLATFORM_mx7 = "IMX7D"
