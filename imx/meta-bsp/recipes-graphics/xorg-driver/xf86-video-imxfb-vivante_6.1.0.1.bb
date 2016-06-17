# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += "file://rc.autohdmi"

SRC_URI[md5sum] = "ae43e7603b29bbc79e5546a2e97aa050"
SRC_URI[sha256sum] = "15b00fbbbd863b0b88ee6e3183a29e04be759d48c07b74e905f92ce7934e2590"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8)"
