# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx6sll += "imx-vpu"
DEPENDS_mx7d   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "8abbcaff5e716f415d8b328761194fc2"
SRC_URI[sha256sum] = "923710b2118517be3ea722023b3f9982301d10e6dabf6cff2853e2cf9d76a536"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
