# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += "file://rc.autohdmi"

SRC_URI[md5sum] = "9c813102f4cce1740b9234de91296e8e"
SRC_URI[sha256sum] = "cab5053932e81c1eb12a45c164e08ef2a7a59fc5248f066ee04c6d964a5e76b0"

#RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

#RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8)"
