# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "510dbff602806635b431d2ef68154efd"
SRC_URI[sha256sum] = "d0a071eb736c55d2ef8717510d015194a9d349708cf1bbea74adcc58ee8097c2"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
