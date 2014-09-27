# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

S="${WORKDIR}/${PN}-${PV}"

PE = "1"

SRC_URI[md5sum] = "0485e457eafe5a10274d171b3af79e2f"
SRC_URI[sha256sum] = "011eb34c6fd1b1ea9894bbe07a539c1aeee1500bc8fdd29d8ce1dc1d02f79e24"

PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
