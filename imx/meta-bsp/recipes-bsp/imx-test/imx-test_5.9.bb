# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx6sll += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "95ceecd81eef32318b07b995a7279bf7"
SRC_URI[sha256sum] = "248fa4ed9f70f4d3f84c4e53416a91ea4b0776cad0f67d71100039411462f550"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
