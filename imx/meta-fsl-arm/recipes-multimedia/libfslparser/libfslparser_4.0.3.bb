# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "f981ef7bef9bec357321e0a91202ed77"
SRC_URI[sha256sum] = "de3cba46681cf35a8c1d9963b76b6577f73386e8549db684446b4ecb2a223256"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
