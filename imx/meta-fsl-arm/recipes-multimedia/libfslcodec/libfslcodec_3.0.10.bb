# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "d1786a67ce7a5546768a268056594da6"
SRC_URI[sha256sum] = "fabb8dc51ce6af7443ea6df2ccb85a8a43a6ad326269933736477b7203c02478"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
