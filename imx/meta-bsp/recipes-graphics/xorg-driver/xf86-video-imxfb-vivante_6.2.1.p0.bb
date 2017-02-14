# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += "file://rc.autohdmi"

SRC_URI[md5sum] = "ab253e5f617c5c2b5f57f18a84b72fd8"
SRC_URI[sha256sum] = "705cf4ae587f30b51bcce7b87113e9b58b9ba0b96fb1271221c0afd686c5f2ea"

DEPENDS_mx8 = "virtual/libg2d virtual/xserver"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
