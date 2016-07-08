# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

SRC_URI[md5sum] = "ae762525d9ba2bd7fb3bab20608d632e"
SRC_URI[sha256sum] = "3769d914286bcbd0ba6bd6b1c49123f76a2eaf9a4d1a18c99c0c9f66bd80bb51"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
