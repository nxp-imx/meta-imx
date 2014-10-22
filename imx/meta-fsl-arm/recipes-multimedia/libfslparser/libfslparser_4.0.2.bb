# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "0c0369729c74eefc8c1851a170624e6a"
SRC_URI[sha256sum] = "4146371e9bb9a3f56f2f8447acd96c24c85c8c236e977f1050d01a58ebb4628f"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
