# Copyright (C) 2012-2016 Freescale Semiconductor

require firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=8cf95184c220e247b9917e7244124c5a"

SRC_URI[md5sum] = "56ac434c1bba7138f10ef3d7136be3bd"
SRC_URI[sha256sum] = "8a58db9a450f9afb785b6b4d06754f38d1ddd5f86454274001c37a99de83717c"

#BRCM firmware git
SRCREV = "951c1363abe95dd75ab3e9447f640d7807240236"

COMPATIBLE_MACHINE = "(mx5|mx6|mx6ul|mx7)"
