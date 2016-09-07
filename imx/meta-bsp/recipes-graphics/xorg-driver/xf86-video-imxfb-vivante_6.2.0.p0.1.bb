# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += "file://rc.autohdmi"

SRC_URI[md5sum] = "f35ac0e9927973ef195de24ee0e96fcb"
SRC_URI[sha256sum] = "a14a27b5f66e3a8baed14b0e741f4140d4aadaef22326c885cca1e8e60b6dbde"

DEPENDS_mx8 = "virtual/libg2d virtual/xserver"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
