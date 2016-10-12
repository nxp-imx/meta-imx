# Copyright (C) 2012-2016 Freescale Semiconductor

require firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=d4f548f93b5fe0ee2bc86758c344412d"

SRC_URI[md5sum] = "140d489744e2d3cce3b8fd17731a3cce"
SRC_URI[sha256sum] = "b84afb4a4c675e6b2537a0b31aabb2b4e39109d1f337612bc898294ac84ec5b7"

#BRCM firmware git
SRCREV = "951c1363abe95dd75ab3e9447f640d7807240236"

COMPATIBLE_MACHINE = "(mx5|mx6|mx6ul|mx6sll|mx7)"
