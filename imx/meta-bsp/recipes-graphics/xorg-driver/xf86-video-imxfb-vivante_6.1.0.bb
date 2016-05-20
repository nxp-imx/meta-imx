# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += " file://Stop-using-Git-to-write-local-version.patch \
             file://rc.autohdmi"

SRC_URI[md5sum] = "e42694892707a176130cbb513199c92b"
SRC_URI[sha256sum] = "5d8ea94ef921b4bd45ff6aec0eeb20deddc9a4e83068756075f86c85ade5934c"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri"

COMPATIBLE_MACHINE = "(mx6|mx8)"
