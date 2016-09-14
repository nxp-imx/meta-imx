# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "bf55f7c2c9fd6664d640557f7cd107a1"
SRC_URI[sha256sum] = "d7a503112098befc91c4d256d8683ca11eb4246123f4e57cf2df498791294888"


COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
