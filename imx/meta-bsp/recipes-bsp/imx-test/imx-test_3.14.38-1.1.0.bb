# Copyright (C) 2013-2015 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc
DEPENDS_mx7d = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://clocks.sh"
SRC_URI_append_mxs = " file://clocks.sh"

SRC_URI = "${FSL_MIRROR}/${PN}-3.14.28-7D-alpha.tar.gz"
S = "${WORKDIR}/${PN}-3.14.28-7D-alpha"

SRC_URI[md5sum] = "47fb335c4822a914ba5c7d0b2f95fb83"
SRC_URI[sha256sum] = "f7593198d90f4c685441a1a52e91a3691a9d6f9f7eab808634d98d9367cff641"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx7)"

PLATFORM_mx7 = "IMX7D"
PLATFORM_mx6ul = "IMX7D"
