# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "f458e904a182dd9718ffe1e18ef19e6c"
SRC_URI[sha256sum] = "e887f312d44b38ae2a3a555bfdfcf05b36b79b3e1a508b37e30b97dba440d86f"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
