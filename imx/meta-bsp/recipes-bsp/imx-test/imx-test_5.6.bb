# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

SRC_URI[md5sum] = "20cf8f1641d26a61e44b312ad396e6f3"
SRC_URI[sha256sum] = "f25b1205ca53ab32188ac9947b19433196a1a761b950f9a865c7f1270d58a6d7"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
