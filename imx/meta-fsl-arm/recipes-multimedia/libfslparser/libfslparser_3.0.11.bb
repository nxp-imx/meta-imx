# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "e94b289347fbf74892bd55d68ca0459b"
SRC_URI[sha256sum] = "43abd3da24c3f3d27cedfbc5949b68b4a4e09c99e2da3d61e6ca5b1dbad2d1eb"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
