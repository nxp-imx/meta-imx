# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "5e7158906162cbf7925a35144b2d0586"
SRC_URI[sha256sum] = "70e6a4179ca8e335566e7fbac084428c57826ef42011681b8c7018084f08bdc3"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
