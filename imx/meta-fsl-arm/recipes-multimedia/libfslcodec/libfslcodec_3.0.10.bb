# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "34082e48c45c96c5f48f8fb75f49b3a7"
SRC_URI[sha256sum] = "e1456696ca7c72e6dc775d5b58106941e1184ddb573a076d109ae1267b49ecf1"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
