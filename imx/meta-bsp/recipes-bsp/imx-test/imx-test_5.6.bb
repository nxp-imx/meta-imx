# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

SRC_URI[md5sum] = "43cf209ff6a93f33fab763a09720a12e"
SRC_URI[sha256sum] = "6ad8b30cd77224edbd8d1e2941a8fb1252909a8926c3c2e91c0118438d964da2"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
