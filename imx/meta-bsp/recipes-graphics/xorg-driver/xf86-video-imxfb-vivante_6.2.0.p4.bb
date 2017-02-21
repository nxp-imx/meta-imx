# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += "file://rc.autohdmi"

SRC_URI[md5sum] = "315816afd6c4bdc345c551823ba8c754"
SRC_URI[sha256sum] = "1963cb39a71e26cea131943c9988fe683f144eb9b11c48d09f86667f3982246a"

DEPENDS_mx8 = "virtual/libg2d virtual/xserver"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
