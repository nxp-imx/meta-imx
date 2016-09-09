# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "3b5d581e35a649378402a26974463db6"
SRC_URI[sha256sum] = "720c55ac43d2608c6a6aec6ff3cc2275ccc38e83dfbff3494d318ab80ee1d08f"


COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
