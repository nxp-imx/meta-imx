# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

S="${WORKDIR}/${PN}-${PV}"

PE = "1"

SRC_URI[md5sum] = "3962c59aa7d87423187c44d92dc57f00"
SRC_URI[sha256sum] = "812dbf9b3dddbae72966d77c25550090a46403ace3d3be6135f234bd244a3bf6"

PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
