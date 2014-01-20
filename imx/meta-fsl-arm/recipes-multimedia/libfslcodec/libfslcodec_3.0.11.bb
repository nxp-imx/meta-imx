# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "bd9d00ffee56d93a7441747115793e66"
SRC_URI[sha256sum] = "0d04cb6a66f6b34a8ffd71ed7b3c53bf66052661f8c87e56a6eb2e79d99b03f0"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
