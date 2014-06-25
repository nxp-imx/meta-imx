# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "6642226eaa60556b55bc676f22607af2"
SRC_URI[sha256sum] = "bb05dfada4e3b94f523d14ace11b65e2d162a9d889bfffbc9311c50326e36f2c"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
