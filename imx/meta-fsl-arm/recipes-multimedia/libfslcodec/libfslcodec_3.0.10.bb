# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "f6567c05b6f0bdd3c950b6db307eb291"
SRC_URI[sha256sum] = "f2c85f8aca842dbccdeab3b5a7adb1978cdb237d03b2f10dad29955bb5e9b2c2"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
