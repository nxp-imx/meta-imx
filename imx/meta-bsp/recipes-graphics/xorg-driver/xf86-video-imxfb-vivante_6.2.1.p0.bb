# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += "file://rc.autohdmi"

SRC_URI[md5sum] = "ec17dbc0aff065d4fa6ea1816cc80c1c"
SRC_URI[sha256sum] = "60e0a4f9c10df36f89cf63575035962bf33834e2137708379816e2187a6df5a5"

DEPENDS_mx8 = "virtual/libg2d virtual/xserver"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
