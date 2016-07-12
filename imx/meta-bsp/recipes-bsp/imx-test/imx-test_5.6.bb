# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

SRC_URI[md5sum] = "985d66af1bbad7ce67135c089c9c0cb6"
SRC_URI[sha256sum] = "02c2ba5440c95663a0ff4066320efc5473408b7cef66542d08dbfbcac824d364"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
