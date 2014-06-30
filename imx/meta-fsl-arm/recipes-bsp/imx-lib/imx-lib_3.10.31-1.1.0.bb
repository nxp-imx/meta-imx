# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-beta.tar.gz"

S="${WORKDIR}/${PN}-${PV}-beta"

PE = "1"

SRC_URI[md5sum] = "c17e70d0568d4d6185408907b8e558c3"
SRC_URI[sha256sum] = "7a465fd93d63f8241d4866ae2393f31c5758820a8bf19a742017c74e0991452a"

PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
