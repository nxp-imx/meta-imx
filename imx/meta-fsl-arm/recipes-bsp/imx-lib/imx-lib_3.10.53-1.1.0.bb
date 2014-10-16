# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

S="${WORKDIR}/${PN}-${PV}"

PE = "1"

SRC_URI[md5sum] = "fed2da55d305118d8ad11235484bf03f"
SRC_URI[sha256sum] = "1a6b1f3a2d362397f5c467567674e330c24a68017a543898a863a914478bc8a9"

PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
