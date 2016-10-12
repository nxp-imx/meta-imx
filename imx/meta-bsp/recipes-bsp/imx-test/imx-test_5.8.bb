# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx6sll += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "3340e183ea792d4eec0fa78189e9ab6e"
SRC_URI[sha256sum] = "61801e708d4be3b449a400c5846a323f5e0e0ae4310fb8529cae07bf96123e70"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
