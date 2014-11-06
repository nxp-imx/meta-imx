# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "0ebafe19b3c55ee1ad0767bc4d9af14d"
SRC_URI[sha256sum] = "2e4fa900cfa5ec76a59ee8d5240d3aa934db04375fe1e2c604063a51be5a137f"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
