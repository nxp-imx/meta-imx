# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "17c4168b4ba49b2ddac5681c62d65247"
SRC_URI[sha256sum] = "b81bd0488016e7f4ceb2e468ecdccee8620c8dba98f81d5dc3f6b5e8b1c2bb43"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
