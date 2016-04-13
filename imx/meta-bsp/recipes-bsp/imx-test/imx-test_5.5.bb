# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7d  += "imx-vpu"

SRC_URI[md5sum] = "392d6ac40dcb8282fcbc6624c9c2c4ce"
SRC_URI[sha256sum] = "1b19332fa4d521eabfe30fb9da9c80bc7d6ca16a966a0ec2e20f49d706737526"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
