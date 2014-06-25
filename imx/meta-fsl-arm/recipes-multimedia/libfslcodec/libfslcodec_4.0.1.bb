# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "233a4acd95db63ab45d2d7b41b8ea651"
SRC_URI[sha256sum] = "25c2e4985f2efc6146e61f9dd75a392fd36397826036dddd8acb628805bb2594"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
