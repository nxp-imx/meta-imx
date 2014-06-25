# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "e29c3ad5b28356bcd0c5e067cca6e66c"
SRC_URI[sha256sum] = "6e9598f3fb4e986ac8216ee0c8f430da1bc4b20f77c90667e30151b2f490325a"


COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
