# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "8ab3e9fd968114b1db8ad77b2f3d250d"
SRC_URI[sha256sum] = "fba81e02141fac8f52bdeb085c81cc0fcdf6a508957ac3d9d999f67ea638100c"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
