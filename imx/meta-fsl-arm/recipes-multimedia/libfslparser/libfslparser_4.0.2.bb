# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "52c58f5ad9b4d603e3e53fae8f0e21d9"
SRC_URI[sha256sum] = "2306ff327a52c52edf3d6635db33351dbd005b44a0884ed82a61e5ebccac8155"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
