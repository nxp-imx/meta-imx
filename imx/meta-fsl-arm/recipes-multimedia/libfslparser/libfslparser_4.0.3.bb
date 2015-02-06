# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "c4e3fafc28aad747503d58d107234333"
SRC_URI[sha256sum] = "b52cf08b2fcf62de13df41721c4f8270895edb9ae490962bcefc36f6312f79b3"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
