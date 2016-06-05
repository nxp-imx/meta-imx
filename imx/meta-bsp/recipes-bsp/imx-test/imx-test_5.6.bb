# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7d  += "imx-vpu"

SRC_URI[md5sum] = "34872e6fa3d5aef03168865bfaf55e85"
SRC_URI[sha256sum] = "322b552d5ac952f0fd2915f487a178f05f6b9d79172661a71d95dc5408ca196d"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
