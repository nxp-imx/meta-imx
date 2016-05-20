# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += " file://Stop-using-Git-to-write-local-version.patch \
             file://rc.autohdmi"

SRC_URI[md5sum] = "8ae8d05ed68b921e1d3733e457647834"
SRC_URI[sha256sum] = "caedd83dbf5f118eb750b66da78f8f1070e242a0ca578f295542278a365e92b1"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri"

COMPATIBLE_MACHINE = "(mx6|mx8)"
