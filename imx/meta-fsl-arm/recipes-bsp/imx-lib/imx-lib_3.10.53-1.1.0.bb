# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

S="${WORKDIR}/${PN}-${PV}"

PE = "1"

SRC_URI[md5sum] = "c103f0e1afefbd2ec6e6cde82cb437e7"
SRC_URI[sha256sum] = "8a8497bd44d71055da4dad29215fc056faa415e747c02a69c5e319732a9c2958"

PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
