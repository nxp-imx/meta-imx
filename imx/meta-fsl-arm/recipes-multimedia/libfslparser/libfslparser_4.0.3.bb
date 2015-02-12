# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "cbda578952e637b0508779a52560c9a9"
SRC_URI[sha256sum] = "c5c6bd54556489fe0bdd77f25d6ca87ce02dd9e5e56f143c1235d667b6763595"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
