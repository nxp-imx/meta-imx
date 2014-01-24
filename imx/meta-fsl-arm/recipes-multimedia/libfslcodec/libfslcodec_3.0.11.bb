# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "a9be9c370ea7d942a87dccccd810a0bf"
SRC_URI[sha256sum] = "7bde281953d303b3b04c2a2dec144d0eed5c43395c16797fa8092469de973bcb"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
