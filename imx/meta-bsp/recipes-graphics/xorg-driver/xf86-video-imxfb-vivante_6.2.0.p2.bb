# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += "file://rc.autohdmi"

SRC_URI[md5sum] = "5ca88fa26d3161592b6c2e84cbfd7af4"
SRC_URI[sha256sum] = "1e8b77e138756dc13cd42f8233be7432e1cef045c922b1ca48568cdf9920ad49"

DEPENDS_mx8 = "virtual/libg2d virtual/xserver"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
