# Copyright (C) 2013-14 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

#PLATFORM_mx6sl = "IMX6S"

SRC_URI[md5sum] = "c8f3fa5c2fcdfca41cdb3b84782957db"
SRC_URI[sha256sum] = "33f6ad85b81473874729c2d2cadd085e149c248c02d8ac358d119c6ed8a6535a"

PE = "1"

COMPATIBLE_MACHINE = "(mx6)"

# remove g2d for ga release
do_configure () {
    rm -rf ${S}/g2d
}
