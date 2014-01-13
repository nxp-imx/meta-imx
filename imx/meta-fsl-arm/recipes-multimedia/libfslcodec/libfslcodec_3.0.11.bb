# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "58cacb7a79aad8169ff7ce12d8bf8ac8"
SRC_URI[sha256sum] = "f0869bc3c6bfc16144b962fc5f3187d8228e100d7ad89e7a9efd6e2cff916140"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
