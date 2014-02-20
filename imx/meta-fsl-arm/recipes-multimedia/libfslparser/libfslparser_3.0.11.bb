# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "d141c9e0b8221a306db4b1e161fd8e04"
SRC_URI[sha256sum] = "921a5f6dab239eadd08dc7ac1f36d666cf76cf61c6cd32ab9d68069986ea7c96"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
