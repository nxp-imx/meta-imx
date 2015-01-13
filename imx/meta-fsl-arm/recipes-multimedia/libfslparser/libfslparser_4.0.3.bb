# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "3b77fb127117fa7d4d86dfe132204925"
SRC_URI[sha256sum] = "536e2eca92b8a9736d87e8a125757b686057746f6758538716ecad8a2f69622b"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
