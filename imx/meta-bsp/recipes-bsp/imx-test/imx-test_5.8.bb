# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx6sll += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "e042c3dca166c85b68aa3eb366dd060a"
SRC_URI[sha256sum] = "771f5c668553082a9474f5108af8206fd3e6030022cdaaaa40420aaba45c156b"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
