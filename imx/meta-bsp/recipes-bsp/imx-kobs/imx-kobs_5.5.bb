# Copyright (C) 2013-2016 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "261657197683d13807c8c8e4ea8075bd"
SRC_URI[sha256sum] = "bcda762a1365c862e65d2a1ba7cf68fb7f9bf5f5e23f97fa4ece213c82a612e5"

inherit  autotools pkgconfig

COMPATIBLE_MACHINE = "(imx)"
