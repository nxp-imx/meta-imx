# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.tar.gz"
S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "995cc8112d36a0c680867c4ea2eb6303"
SRC_URI[sha256sum] = "20084c0e921c16b199734aadb98f01435ac263f3a4ae8421129bef41191a33bf"

COMPATIBLE_MACHINE = "(mx6)"