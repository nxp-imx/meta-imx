# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI[md5sum] = "5a1655793ed50db0f6d24b7ce2bce583"
SRC_URI[sha256sum] = "abb2882b5c21a543f98578beaf1ba99ff338ff2b9de1f119e471136170c3f67d"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7)"

PLATFORM_mx7 = "IMX7D"
