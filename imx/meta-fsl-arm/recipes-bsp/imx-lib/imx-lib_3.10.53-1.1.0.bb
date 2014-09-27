# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

S="${WORKDIR}/${PN}-${PV}"

PE = "1"

SRC_URI[md5sum] = "d5074d3f40f33e678503015141b4ac09"
SRC_URI[sha256sum] = "898ea4c204b920098ef08be17bff31a0ebc48333630d1150ecbb2e35f94db7ed"

PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
