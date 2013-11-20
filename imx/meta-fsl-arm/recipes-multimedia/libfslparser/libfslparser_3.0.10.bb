# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "dbf26039069217e1f5dc5e1ddeecb391"
SRC_URI[sha256sum] = "472fd58ee4a2bdf5b21d121ee4c90cc3d308d32f8a083b11c3d3ee09af789452"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
