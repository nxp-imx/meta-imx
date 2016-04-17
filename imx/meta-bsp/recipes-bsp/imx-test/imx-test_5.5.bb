# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7d  += "imx-vpu"

SRC_URI[md5sum] = "756a82501d66af3e92e696e8ca6924c5"
SRC_URI[sha256sum] = "5f3e3c75e26db4a4cabb6e908f51db961c27cdf5e35ed6cb0dec736cad161f31"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
