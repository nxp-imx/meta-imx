# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "05c957071beb5b61646c801507f3d9ad"
SRC_URI[sha256sum] = "8034dd31481f7eb16deb41c0f221e63af99fec481a52f352738c9ca9baa557c9"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
