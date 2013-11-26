# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "eca123e06d65c7970d3b03833ba437f9"
SRC_URI[sha256sum] = "130a42b9130760884758712d2704054e8f6a15922a40a0d05ec7c889462f0b3d"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
