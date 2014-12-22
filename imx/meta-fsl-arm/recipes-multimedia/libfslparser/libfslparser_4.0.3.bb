# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "dc3195f747861402de09d6ce4fe6269d"
SRC_URI[sha256sum] = "0df6e9709040d83fdc8857199f8d439e94723d730d9cebd22b212b9b2ac75506"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
