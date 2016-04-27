# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7d  += "imx-vpu"

SRC_URI[md5sum] = "d58c9d4bd4768925e4c5f7dc7d6c7cc2"
SRC_URI[sha256sum] = "4b6dcf333ea8b07a64cd0c0e090e67070a9ad154f37bb360469590362ce73c3e"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
