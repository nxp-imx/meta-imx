# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "9d467c9e80ff30edddf4e25ec8d9c516"
SRC_URI[sha256sum] = "c6e32decf4cbe451f5342d764b72dcec0398af96e78a1abb38704fcfa4ab5f91"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
