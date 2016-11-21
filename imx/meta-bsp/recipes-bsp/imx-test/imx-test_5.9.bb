# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx6sll += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "870849555ec64fd1bdc50fe07c7bd99a"
SRC_URI[sha256sum] = "8e974a37c7e936bcc6a18b66a671e55f5756fbbd3ba0bf58b2b7756aaa14aa2b"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
