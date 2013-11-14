# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "c17e0a2eada4a2af06e74a1d8efb913b"
SRC_URI[sha256sum] = "f8a66f7380712d19094c9e313b9281d8f65befecb67b289509f70e8573a1153d"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
