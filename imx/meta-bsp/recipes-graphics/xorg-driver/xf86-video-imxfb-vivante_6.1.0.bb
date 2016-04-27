# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += " file://Stop-using-Git-to-write-local-version.patch \
             file://rc.autohdmi"

SRC_URI[md5sum] = "c6444b94e728df1e4395112f54fadc2f"
SRC_URI[sha256sum] = "61e291fddd0b96f22c1be8cb3debebd49fcb47c89f789703a6f059690be72f77"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri"

COMPATIBLE_MACHINE = "(mx6|mx8)"
