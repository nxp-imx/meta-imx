# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "848b88fedcdbcfa7872724040c567b9c"
SRC_URI[sha256sum] = "9f8a23cf3640564e13bbb826ec40c66eec6c5f41b0d6443b003f477fe9fb2e6f"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
