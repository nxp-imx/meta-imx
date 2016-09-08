# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += "file://rc.autohdmi"

SRC_URI[md5sum] = "027a748626ebba2e2fc3fc28e74939bc"
SRC_URI[sha256sum] = "550b20b18f375e2b2124fe1a09ec387423e7fdd7589a68aa0ec1353eec4083f4"

DEPENDS_mx8 = "virtual/libg2d virtual/xserver"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
